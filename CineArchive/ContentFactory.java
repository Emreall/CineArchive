public class ContentFactory {
    public static Content createContent(String type, String title, String genre, String director, String mainCast, int releaseYear, double rating) {
        if (type.equalsIgnoreCase("movie")) {
            return new Movie(title, genre, director, mainCast, releaseYear, rating);
        } else if (type.equalsIgnoreCase("tvshow")) {
            return new TVShow(title, genre, director, mainCast, releaseYear, rating);
        } else {
            return null;
        }
    }
}