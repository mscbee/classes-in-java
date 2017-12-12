package movielist;
import java.util.Scanner;

/**
 * Created by cba50 on 12/12/2017.
 */
public class MovieList {
    public static void main(String[] args) {

        String movieName;
        char rating;
        int year;
        int runtime;

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter the name of the movie, its rating (A-D), the year of release, and the runtime in minutes");

        movieName = in.next();
        rating = in.next().charAt(0);
        year = in.nextInt();
        runtime = in.nextInt();

        //defining objects / class instances
        Movie newMovie = new Movie(movieName, rating, year, runtime);

        System.out.println(newMovie.toString());
    }
}
