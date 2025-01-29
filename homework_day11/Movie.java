package homework_day11;

public class Movie {
	// Attributes
    private String title;
    private String director;
    private String actor1, actor2, actor3;

    // Constructor for title and director
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // Constructor for three actors
    public Movie(String actor1, String actor2, String actor3) {
        this.actor1 = actor1;
        this.actor2 = actor2;
        this.actor3 = actor3;
    }

    // Method to display movie details
    public void displayMovieDetails() {
        if (title != null && director != null) {
            System.out.println("Movie Title: " + title);
            System.out.println("Director: " + director);
        }
        if (actor1 != null && actor2 != null && actor3 != null) {
            System.out.println("Actors: " + actor1 + ", " + actor2 + ", " + actor3);
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        // Creating a Movie object using title and director constructor
        Movie movie1 = new Movie("Inception", "Christopher Nolan");

        // Creating a Movie object using actors constructor
        Movie movie2 = new Movie("Leonardo DiCaprio", "Joseph Gordon-Levitt", "Ellen Page");

        // Displaying movie details
        System.out.println("Movie 1 Details:");
        movie1.displayMovieDetails();

        System.out.println("Movie 2 Details:");
        movie2.displayMovieDetails();
    }
}

