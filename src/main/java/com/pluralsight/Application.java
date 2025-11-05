package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<Movie> movies = getMovies();
        for (Movie movie: movies) {
            System.out.println(movie);
        }
    }

    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();

        movies.add(new Movie("Oppenheimer", "Drama", 2023, "Christopher Nolan", 8.4, 950, 180));
        movies.add(new Movie("Barbie", "Comedy", 2023, "Greta Gerwig", 7.0, 1400, 114));
        movies.add(new Movie("Dune: Part Two", "Sci-Fi", 2024, "Denis Villeneuve", 8.7, 680, 166));
        movies.add(new Movie("Killers of the Flower Moon", "Crime", 2023, "Martin Scorsese", 7.8, 156, 206));
        movies.add(new Movie("Spider-Man: Across the Spider-Verse", "Animation", 2023, "Joaquim Dos Santos", 8.9, 690, 140));
        movies.add(new Movie("The Batman", "Action", 2022, "Matt Reeves", 7.8, 772, 176));
        movies.add(new Movie("Top Gun: Maverick", "Action", 2022, "Joseph Kosinski", 8.2, 1495, 130));
        movies.add(new Movie("Avatar: The Way of Water", "Sci-Fi", 2022, "James Cameron", 7.7, 2320, 192));
        movies.add(new Movie("Everything Everywhere All at Once", "Adventure", 2022, "Daniel Kwan", 8.1, 143, 139));
        movies.add(new Movie("The Marvels", "Action", 2023, "Nia DaCosta", 6.1, 206, 105));
        movies.add(new Movie("Mission: Impossible – Dead Reckoning Part One", "Action", 2023, "Christopher McQuarrie", 7.7, 567, 163));
        movies.add(new Movie("Wonka", "Fantasy", 2023, "Paul King", 7.1, 630, 116));
        movies.add(new Movie("The Super Mario Bros. Movie", "Animation", 2023, "Aaron Horvath", 7.0, 1378, 92));
        movies.add(new Movie("John Wick: Chapter 4", "Action", 2023, "Chad Stahelski", 7.8, 440, 169));
        movies.add(new Movie("Nope", "Horror", 2022, "Jordan Peele", 6.8, 172, 130));
        movies.add(new Movie("The Whale", "Drama", 2022, "Darren Aronofsky", 7.8, 54, 117));
        movies.add(new Movie("Guardians of the Galaxy Vol. 3", "Action", 2023, "James Gunn", 8.0, 845, 150));
        movies.add(new Movie("Inside Out 2", "Animation", 2024, "Kelsey Mann", 8.5, 1230, 100));
        movies.add(new Movie("The Fabelmans", "Drama", 2022, "Steven Spielberg", 7.6, 45, 151));
        movies.add(new Movie("Saltburn", "Thriller", 2023, "Emerald Fennell", 7.0, 90, 131));

        return movies;
    }
}
