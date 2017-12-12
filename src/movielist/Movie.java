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

    //accessor aka getter
    public String getMovieName() {
        return movieName;
    }

    //mutator aka setter
    public void setMovieName(String value) {
        movieName = value;
    }

    public char getRating() {
        return rating;
    }

    public void setRating (char value) {
        rating = value;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int value) {
        year = value;
    }

    public int getRuntime() {
        return runtime;
    }

    public void setRuntime(int value) {
        runtime = value;
    }

    //method to return information
    public String toString() {
        return " Movie: " + movieName +
                "\n Rating: " + rating +
                "\n Year: " + year +
                "\n Runtime: " + runtime + " mins";
    }


}
