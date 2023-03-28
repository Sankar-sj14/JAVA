import java.util.ArrayList;
import java.util.List;

class Artwork {
    private String title;
    private String artist;
    private int price;

    public Artwork(String title, String artist, int price) {
        this.title = title;
        this.artist = artist;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getPrice() {
        return price;
    }
}

class ArtworkStore {
    private List<Artwork> artworks;

    public ArtworkStore(List<Artwork> artworks) {
        this.artworks = artworks;
    }

    public void sellArtwork(String artworkTitle) throws ArtworkNotFoundException, InsufficientFundsException {
        Artwork artwork = findArtworkByTitle(artworkTitle);
        if (artwork == null) {
            throw new ArtworkNotFoundException("Artwork not found in the store.");
        }
        if (artwork.getPrice() > getBalance()) {
            throw new InsufficientFundsException("You do not have enough funds to purchase this artwork.");
        }
        artworks.remove(artwork);
        System.out.printf("Artwork %s by %s has been sold for %d USD.\n", artwork.getTitle(), artwork.getArtist(), artwork.getPrice());
    }

    private Artwork findArtworkByTitle(String artworkTitle) {
        for (Artwork artwork : artworks) {
            if (artwork.getTitle().equals(artworkTitle)) {
                return artwork;
            }
        }
        return null;
    }

    private int getBalance() {
        // This is a dummy method to simulate the user's balance.
        return 5000000;
    }
}

class ArtworkNotFoundException extends Exception {
    public ArtworkNotFoundException(String message) {
        super(message);
    }
}

class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

// Example usage
public class Lab6 {
    public static void main(String[] args) {
        List<Artwork> artworks = new ArrayList<>();
        artworks.add(new Artwork("Starry Night", "Vincent van Gogh", 1000000));
        artworks.add(new Artwork("The Persistence of Memory", "Salvador Dali", 2000000));
        artworks.add(new Artwork("Mona Lisa", "Leonardo da Vinci", 3000000));

        ArtworkStore store = new ArtworkStore(artworks);

        try {
            store.sellArtwork("The Scream");
        } catch (ArtworkNotFoundException | InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
