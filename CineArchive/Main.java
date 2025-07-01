
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NotificationService notificationService = new NotificationService();

        // Kullanıcı girişi
        System.out.print("Adınızı girin: ");
        String firstName = scanner.nextLine();
        System.out.print("Soyadınızı girin: ");
        String lastName = scanner.nextLine();
        String currentUserName = firstName + " " + lastName;
        User currentUser = new User(currentUserName);
        notificationService.addObserver(currentUser);
        boolean restart;
        do {


        System.out.println("\nHoş geldiniz, " + currentUserName + "! Keyifli seyirler dileriz.\n");

        // Film mi Dizi mi?
        String contentType;
        while (true) {
            System.out.print("Film arşivine mi yoksa dizi arşivine mi bakmak istersiniz? (film/dizi): ");
            contentType = scanner.nextLine().toLowerCase();
            if (contentType.equals("film") || contentType.equals("dizi")) break;
            System.out.println("Geçersiz giriş. Lütfen 'film' veya 'dizi' yazınız.");
        }
        List<Content> selectedLibrary;

        if (contentType.equalsIgnoreCase("dizi")) {
            selectedLibrary = TvShowLibrary.getTvShows();
        } else {
            selectedLibrary = MovieLibrary.getMovies();
        }

        // Filtre seçenekleri
        Set<String> genres = new HashSet<>();
        Set<Integer> years = new TreeSet<>();
        for (Content c : selectedLibrary) {
            genres.add(c.getGenre());
            years.add(c.getReleaseYear());
        }

        String filterOption;
        while (true) {
            System.out.print("Filtre yapmak ister misiniz? (tur/yil/hayir): ");
            filterOption = scanner.nextLine().toLowerCase();
            if (filterOption.equals("tur") || filterOption.equals("yil") || filterOption.equals("hayir")) break;
            System.out.println("Geçersiz giriş. Lütfen 'tur', 'yil' ya da 'hayir' yazınız.");
        }

        if (filterOption.equalsIgnoreCase("tur")) {
            List<String> genreList = new ArrayList<>(genres);
            Collections.sort(genreList);
            for (int i = 0; i < genreList.size(); i++) {
                System.out.println((i + 1) + " - " + genreList.get(i));
            }
            System.out.print("Lütfen bir tür numarası seçin: ");
            int genreChoice = Integer.parseInt(scanner.nextLine()) - 1;
            if (genreChoice >= 0 && genreChoice < genreList.size()) {
                String selectedGenre = genreList.get(genreChoice);
                selectedLibrary.removeIf(c -> !c.getGenre().equalsIgnoreCase(selectedGenre));
            }
        } else if (filterOption.equalsIgnoreCase("yil")) {
            System.out.print("Hangi yıldan sonra çıkan içerikleri görmek istersiniz? ");
            int selectedYear = Integer.parseInt(scanner.nextLine());
            selectedLibrary.removeIf(c -> c.getReleaseYear() < selectedYear);
        }

        selectedLibrary.sort(Comparator.comparing(c -> c.getTitle().toLowerCase()));

        String devam;
        boolean firstRun = true;
do {
            System.out.println("\n🎬 İçerik Listesi:");
            for (int i = 0; i < selectedLibrary.size(); i++) {
                System.out.println((i + 1) + ". " + selectedLibrary.get(i).getTitle());
            }

            System.out.print("Bir içerik numarası seçin (1-" + selectedLibrary.size() + "): ");
            int selectedIndex = Integer.parseInt(scanner.nextLine()) - 1;

            if (selectedIndex < 0 || selectedIndex >= selectedLibrary.size()) {
                System.out.println("Geçersiz seçim.");
            } else {
                Content selected = selectedLibrary.get(selectedIndex);
                selected.displayInfo();
            // Yeni içerik bildirimi gönder
            notificationService.notifyAllObservers("Yeni içerik eklendi: " + selected.getTitle());


                String watchedInput;
                while (true) {
                    System.out.print("Bu içeriği izlediniz mi? (evet/hayir): ");
                    watchedInput = scanner.nextLine().toLowerCase();
                    if (watchedInput.equals("evet") || watchedInput.equals("hayir")) break;
                    System.out.println("Geçersiz giriş. Lütfen 'evet' veya 'hayir' yazınız.");
                }

                if (watchedInput.equalsIgnoreCase("evet")) {
                    currentUser.markAsWatched(selected);

                    System.out.print("Filme puan vermek ister misiniz? (evet/hayir): ");
                    if (scanner.nextLine().equalsIgnoreCase("evet")) {
                        System.out.print("Puan (0-10): ");
                        double puan = Double.parseDouble(scanner.nextLine());
                        currentUser.rateContent(selected, puan);
                    }

                    System.out.print("Yorum yapmak ister misiniz? (evet/hayir): ");
                    if (scanner.nextLine().equalsIgnoreCase("evet")) {
                        System.out.print("Yorum: ");
                        String yorum = scanner.nextLine();
                        currentUser.addReview(selected, yorum);
                        selected.showReviews();
                    }
                } else {
                    String ekle;
                    while (true) {
                        System.out.print("Watchlist'e eklemek ister misiniz? (evet/hayir): ");
                        ekle = scanner.nextLine().toLowerCase();
                        if (ekle.equals("evet") || ekle.equals("hayir")) break;
                        System.out.println("Geçersiz giriş. Lütfen 'evet' veya 'hayir' yazınız.");
                    }
                    if (ekle.equalsIgnoreCase("evet")) {
                        currentUser.addToWatchlist(selected);
                        System.out.println("Watchlist'e eklendi.");
                    }
                }
            }

            String continueAnswer;
        while (true) {
            System.out.print("Başka bir içerik seçmek ister misiniz? (evet/hayir): ");
            continueAnswer = scanner.nextLine().toLowerCase();
            if (continueAnswer.equals("evet") || continueAnswer.equals("hayir")) break;
            System.out.println("Geçersiz giriş. Lütfen 'evet' veya 'hayir' yazınız.");
        }
        if (continueAnswer.equals("evet")) {
            System.out.print("Film arşivine mi yoksa dizi arşivine mi bakmak istersiniz? (film/dizi): ");
            contentType = scanner.nextLine();
            selectedLibrary = contentType.equalsIgnoreCase("dizi") ? TvShowLibrary.getTvShows() : MovieLibrary.getMovies();
            genres.clear();
            years.clear();
            for (Content c : selectedLibrary) {
                genres.add(c.getGenre());
                years.add(c.getReleaseYear());
            }
            System.out.print("Filtre yapmak ister misiniz? (tur/yil/hayir): ");
            String filterOption2 = scanner.nextLine();
            if (filterOption2.equalsIgnoreCase("tur")) {
                List<String> genreList2 = new ArrayList<>(genres);
                Collections.sort(genreList2);
                for (int i = 0; i < genreList2.size(); i++) {
                    System.out.println((i + 1) + " - " + genreList2.get(i));
                }
                System.out.print("Lütfen bir tür numarası seçin: ");
                int genreChoice2 = Integer.parseInt(scanner.nextLine()) - 1;
                if (genreChoice2 >= 0 && genreChoice2 < genreList2.size()) {
                    String selectedGenre2 = genreList2.get(genreChoice2);
                    selectedLibrary.removeIf(c -> !c.getGenre().equalsIgnoreCase(selectedGenre2));
                }
            } else if (filterOption2.equalsIgnoreCase("yil")) {
                System.out.print("Hangi yıldan sonra çıkan içerikleri görmek istersiniz? ");
                int selectedYear2 = Integer.parseInt(scanner.nextLine());
                selectedLibrary.removeIf(c -> c.getReleaseYear() < selectedYear2);
            }
            selectedLibrary.sort(Comparator.comparing(c -> c.getTitle().toLowerCase()));
        } else {
            break;
        }
            devam = scanner.nextLine();
        } while (devam.equalsIgnoreCase("evet"));

        
            System.out.print("Yeni bir içerik seçmek ister misiniz? (evet/hayir): ");
            String again = scanner.nextLine().toLowerCase();
            restart = again.equals("evet");
        } while (restart);

        scanner.close();
    }
}
