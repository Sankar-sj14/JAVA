// Abstract class representing an artist
abstract class Artist {
    private String name;
    private int age;

    public Artist(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method to get the artist's style
    public abstract String getStyle();

    // Final method to display information about the artist
    public final void displayInfo() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Style: " + getStyle());
    }
}

// Class representing a customer
class Customer {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Class representing an artwork
class Artwork {
    private String title;
    private double price;
    private Artist artist;

    public Artwork(String title, double price, Artist artist) {
        this.title = title;
        this.price = price;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public Artist getArtist() {
        return artist;
    }

    // Method to display information about the artwork and its artist
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
        System.out.println("Artist: " + artist.getName());
        artist.displayInfo();
    }
}

// Class representing a specific type of artist - painter
class Painter extends Artist {
    private String style;

    public Painter(String name, int age, String style) {
        super(name, age);
        this.style = style;
    }

    @Override
    public String getStyle() {
        return style;
    }
}

// Main class to test the implementation
public class ArtworkSelling {
    public static void main(String[] args) {
        // Create an artist and artwork
        Painter painter = new Painter("Bob Ross", 52, "Landscape");
        Artwork artwork = new Artwork("Happy Trees", 1000.0, painter);

        // Display information about the artwork and artist
        artwork.displayInfo();

        // Create a customer
        Customer customer = new Customer("Alice", "alice@example.com");

        // Sell the artwork to the customer
        System.out.println(customer.getName() + " bought " + artwork.getTitle() + " for " + artwork.getPrice());
    }
}
