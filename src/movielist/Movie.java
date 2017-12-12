package movielist;

/**
 * Created by cba50 on 12/12/2017.
 */
public class Movie {
    // instance data
    private String movieName;
    private char rating;
    private int year;
    private int runtime;

    //constructors
    public Movie(String movieName, char rating, int year, int runtime){
        this.movieName = movieName;
        this.rating = rating;
        this.year= year;
        this.runtime = runtime;
    }

    //method to return information
    public String toString() {
        return " Movie: " + movieName +
                "\n Rating: " + rating +
                "\n Year: " + year +
                "\n Runtime: " + runtime + " mins";
    }


}
