import java.util.ArrayList;
import java.util.List;

public abstract class Content {
    protected String title;
    protected String genre;
    protected String director;
    protected String mainCast;
    protected int releaseYear;
    public double rating;
    protected List<String> reviews = new ArrayList<>();

    public Content(String title, String genre, String director, String mainCast, int releaseYear, double rating) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.mainCast = mainCast;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }

    public void showReviews() {
        if (reviews.isEmpty()) {
            System.out.println("Bu içerik için henüz yorum yapılmamış.");
            return;
        }
        System.out.println("\nYorumlar:");
        for (String r : reviews) {
            System.out.println("- " + r);
        }
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public abstract void displayInfo();
}