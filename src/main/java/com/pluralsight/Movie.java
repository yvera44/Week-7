package com.pluralsight;

public class Movie {

    private String title;
    private String genre;
    private int releaseYear;
    private String director;
    private double rating;      // IMDb-style rating (0–10)
    private long boxOffice;     // in millions USD
    private int durationMinutes;

    public Movie(String title, String genre, int releaseYear, String director,
                 double rating, long boxOffice, int durationMinutes) {
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.director = director;
        this.rating = rating;
        this.boxOffice = boxOffice;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getDirector() {
        return director;
    }

    public double getRating() {
        return rating;
    }

    public long getBoxOffice() {
        return boxOffice;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    @Override
    public String toString() {
        return String.format("%s (%d) - %s - %.1f⭐ - $%dM",
                title, releaseYear, genre, rating, boxOffice);
    }
}
