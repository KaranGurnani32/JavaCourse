package classesandobjects;

public class Movie {
    String title;
    String genre;
    int rating;

    void playIt(){
        System.out.println("Play the movie");
    }
}

class MovieRunner{
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Kabhi Khushi Khabi Gam";
        one.genre = "Drama";
        one.rating = 2;

        Movie two = new Movie();
        two.title = "Gully Boy";
        two.genre = "Inspirational";
        two.rating = 4;

        Movie three = new Movie();
        three.title = "Sooryavanshi";
        three.genre = "Thriller";
        three.rating = 1;

        three.playIt();
    }
}
