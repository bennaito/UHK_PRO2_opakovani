package cz.uhk.fim.model;

public class Movie {
    private String name;
    private String author;
    private int year;
    private float rating;

    public Movie(String name, String author, int year, float rating) {
        this.name = name;
        this.author = author;
        this.year = year;
        this.rating = rating;
    }

    public String toString(){
        return name + " (" + year + "), hodnocení:  " + rating + " %, autor: " + author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
