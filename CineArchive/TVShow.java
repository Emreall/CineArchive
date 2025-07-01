public class TVShow extends Content {
    public TVShow(String title, String genre, String director, String mainCast, int releaseYear, double rating) {
        super(title, genre, director, mainCast, releaseYear, rating);
    }

    @Override
    public void displayInfo() {
        System.out.println("\n📺 Dizi Bilgileri:");
        System.out.println("Başlık: " + title);
        System.out.println("Tür: " + genre);
        System.out.println("Yönetmen: " + director);
        System.out.println("Oyuncular: " + mainCast);
        System.out.println("Yıl: " + releaseYear);
        System.out.println("IMDB: " + rating);
    }
}