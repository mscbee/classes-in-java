package movielist;
import java.util.Scanner;
import java.util.ArrayList;

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

        // initialising array list
        ArrayList<Movie> movieArray = new ArrayList<Movie>();

        System.out.println("Please enter the name of the movie: ");
        movieName = in.nextLine(); //.next() only read the input up to the space whereas .nextLine() reads until the end of the line
        System.out.println("Please enter the movie rating (A-D): ");
        rating = in.next().charAt(0);
        System.out.println("Please enter the year of release: ");
        year = in.nextInt();
        System.out.println("Please enter the runtime in minutes: ");
        runtime = in.nextInt();


        // defining objects / class instances /instantiating a class object
        // the first Movie instance is populated by user input
        Movie movie1 = new Movie(movieName, rating, year, runtime);
        // the second movie instance is populated by me passing in some arguments
        Movie movie2 = new Movie("Color Purple", 'A', 1986, 120);

        // adding movie object to array list
        movieArray.add(movie1);
        movieArray.add(movie2);

        // printing our array list
        System.out.println(movieArray.toString());

    }
}
