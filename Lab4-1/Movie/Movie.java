package Movie;

public class Movie {
    static int wscript = 6;
    static int wacting = 13;
    static int wdirection = 11;

    public static int movieRating(int s, int a, int b){
        return wscript*s + wacting*a + wdirection*b;
    }
}
