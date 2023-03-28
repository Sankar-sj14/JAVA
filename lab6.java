package com.artworkselling;

public class Artwork implements Saleable {

    private String artist;
    private String title;
    private double price;

    public Artwork(String artist, String title, double price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    public void displayArtwork() {
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

interface Saleable {
    double getPrice();
}
