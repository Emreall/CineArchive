public class Movie extends Content {
    public Movie(String title, String genre, String director, String mainCast, int releaseYear, double rating) {
        super(title, genre, director, mainCast, releaseYear, rating);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n🎬 Film Bilgileri:");
        System.out.println("Başlık: " + title);
        System.out.println("Tür: " + genre);
        System.out.println("Yönetmen: " + director);
        System.out.println("Başrol: " + mainCast);
        System.out.println("Yıl: " + releaseYear);
        System.out.println("IMDB: " + rating);
    }
}