package com.artworkselling;

public class Lab6 {

    public static void main(String[] args) {
        if (args.length == 3) {
            String artist = args[0];
            String title = args[1];
            double price = Double.parseDouble(args[2]);

            Artwork artwork = new Artwork(artist, title, price);
            artwork.displayArtwork();

            // Set the price to a new value
            artwork.setPrice(2 * artwork.getPrice());
            System.out.println("New price: " + artwork.getPrice());
        } else {
            System.out.println("Invalid number of arguments. Usage: java Main <artist> <title> <price>");
        }
    }
}
