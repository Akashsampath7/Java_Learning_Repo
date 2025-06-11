import java.util.*;

public class Movie {
    int year;
    String name;

    public Movie(int year, String name) {
        this.year = year;
        this.name = name;
    }

    public String toString() {
        return year + " " + name;
    }

    public static void main(String[] args) {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(2012, "Avengers"));
        movies.add(new Movie(2008, "Iron Man"));
        movies.add(new Movie(2019, "Endgame"));

        // Custom sort: by name using Comparator
        Collections.sort(movies, new Comparator<Movie>() {
            public int compare(Movie m1, Movie m2) {
                return m1.name.compareTo(m2.name);
            }
        });

        for (Movie m : movies) {
            System.out.println(m);
        }
    }
}