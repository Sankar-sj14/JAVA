import java.io.*;



	class Person
	{
		String name;
		String address;
		byte age;
		String gender;
		long phoneNo;
		String email;
	
		public Person()
		{
			name="Na";
			address="Na";
			age=0;
			gender="Na";
			phoneNo=0;
			email="Na";
		}
	
		public Person(String name,byte age,String gender,long phoneNo,String email )
		{
			this.name=name;
			this.age=age;
			this.gender=gender;
			this.phoneNo=phoneNo;
			this.email=email;
		}
	
		public void read()
		{
			try
			{
				InputStreamReader isr=new InputStreamReader(System.in);
				BufferedReader br=new BufferedReader(isr);
				System.out.println("Enter your name");
				name=br.readLine();
				System.out.println("Enter Your Address");
				address=br.readLine();
				System.out.println("Enter Your age");
				age=Byte.parseByte(br.readLine());
				System.out.println("Enter Your Gender");
				gender=br.readLine();
				System.out.println("Enter Your phoneNo");
				phoneNo=Long.parseLong(br.readLine());
				System.out.println("Enter your email");
				email=br.readLine();
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	
		public void display()
		{
			System.out.println("Your name is "+name);
			System.out.println("Your address is "+address);
			System.out.println("Your age is "+age);
			System.out.println("Your Gender is "+gender);
			System.out.println("Your phone number is "+phoneNo);
			System.out.println("Your Email is "+email);
		}
	}

	class Artist extends Person
	{
		String genre;
		String awards;
		String organisation;
        int albumcount;
		public Artist()
		{
			super();
			genre="Na";
			awards="Na";
			organisation="Na";
			albumcount=0;
		}
		public Artist(String name,byte age,String gender,long phoneNo,String email,String genre,String awards,String organisation,int albumcount)
		{
            super();
			this.genre=genre;
			this.awards=awards;
			this.organisation=organisation;
			this.albumcount=albumcount;
		}
		public void read()
		{
			try{
			InputStreamReader isr=new InputStreamReader(System.in);
            BufferedReader br=new BufferedReader(isr);
			super.read();
            System.out.println("Enter your genre");
			genre=br.readLine();
			System.out.println("Enter your awards");
			awards=br.readLine();
			System.out.println("Enter your organisation");
			organisation=br.readLine();
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}

		}
		public void getAlbumCount()
		{
			albumcount=0;
		}
		public void getAlbumCount(int albumcount)
		{
			this.albumcount=albumcount;
		}

		public void display()
		{
			super.display();
			System.out.println("Your genre is "+genre);
			System.out.println("Your awards are "+awards);
			System.out.println("Your Organisation is "+organisation);
			System.out.println("Your album count is "+albumcount);
		}
	}
	
	public class lab3
	{
		public static void main(String args [])
		{
			Artist obj=new Artist();
			obj.read();
			obj.getAlbumCount(10);
			obj.display();
		}
	}
	

	