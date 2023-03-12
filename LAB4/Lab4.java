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
        static int id=2247;
        int artistId=0;
        static int artistNumber=0;
        String organisationbranch;
		public Artist()
		{
			super();
			genre="Na";
			awards="Na";
			organisation="Na";
			albumcount=0;
            artistId=id++;
            
		}
		public Artist(String name,byte age,String gender,long phoneNo,String email,String genre,String awards,String organisation,int albumcount)
		{
            super();
			this.genre=genre;
			this.awards=awards;
			this.organisation=organisation;
			this.albumcount=albumcount;
            artistId=id++;
      
		}
        static{
            System.out.println("Welcome to Christ Singing Instituion");
        }
        public static void getArtistNumbers()
        {
            System.out.println("New Artist joining our organisation!");
            artistNumber++;
            System.out.println("Number of new artists joining today: "+artistNumber);
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
            System.out.println("Your Artist id is "+artistId);
		}
        static class OrganisationBranch
        {
            String branchName;
            int branchCode;
            public OrganisationBranch(String branchName,int branchCode)
            {
                this.branchName=branchName;
                this.branchCode=branchCode;
            }
            public void display()
            {
                System.out.println("Welcome to "+branchName+" Branch");
                System.out.println("Branch Code "+branchCode);
            }
	}
}
	public class Lab4
	{
		public static void main(String args [])
		{
            Artist obj2=new Artist();
            Artist.OrganisationBranch  obj1=new Artist.OrganisationBranch("Bangalore Central",56000);
            
            obj2.read();
			obj2.getAlbumCount(10);
			obj2.display();
            Artist.getArtistNumbers();

		}
    }

	

	