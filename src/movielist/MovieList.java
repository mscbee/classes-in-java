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

        System.out.println("Please enter the name of the movie: ");
        movieName = in.nextLine(); //.next() only read the input up to the space whereas .nextLine() reads until the end of the line
        System.out.println("Please enter the movie rating (A-D): ");
        rating = in.next().charAt(0);
        System.out.println("Please enter the year of release: ");
        year = in.nextInt();
        System.out.println("Please enter the runtime in minutes: ");
        runtime = in.nextInt();


        //defining objects / class instances /instantiating a class object
        Movie newMovie = new Movie(movieName, rating, year, runtime);

        System.out.println(newMovie.toString());
    }
}
