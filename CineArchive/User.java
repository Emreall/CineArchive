import java.util.*;

public class User implements Observer {
    private String name;
    private List<Content> watchlist = new ArrayList<>();
    private List<Content> watched = new ArrayList<>();
    private Map<Content, Double> ratings = new HashMap<>();

    public User(String name) {
        this.name = name;
    }

    public void addToWatchlist(Content content) {
        watchlist.add(content);
    }

    public void markAsWatched(Content content) {
        watched.add(content);
    }

    public void rateContent(Content content, double rating) {
        ratings.put(content, rating);
        content.rating = rating;
    }

    public void addReview(Content content, String review) {
        content.addReview(review);
    }

    @Override
    public void update(String message) {
        System.out.println("📢 Bildirim (" + name + "): " + message);
    }
}