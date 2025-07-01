import java.util.*;

public class TvShowLibrary {
    public static List<Content> getTvShows() {
        List<Content> shows = new ArrayList<>();
        shows.add(ContentFactory.createContent("tvshow", "Breaking Bad", "Crime", "Vince Gilligan", "Bryan Cranston", 2008, 9.5));
        shows.add(ContentFactory.createContent("tvshow", "Stranger Things", "Sci-Fi", "The Duffer Brothers", "Millie Bobby Brown", 2016, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "Game of Thrones", "Fantasy", "David Benioff", "Emilia Clarke", 2011, 9.2));
        shows.add(ContentFactory.createContent("tvshow", "The Office", "Comedy", "Greg Daniels", "Steve Carell", 2005, 8.9));
        shows.add(ContentFactory.createContent("tvshow", "Friends", "Comedy", "David Crane", "Jennifer Aniston", 1994, 8.9));
        shows.add(ContentFactory.createContent("tvshow", "The Crown", "Biography", "Peter Morgan", "Olivia Colman", 2016, 8.6));
        shows.add(ContentFactory.createContent("tvshow", "Sherlock", "Crime", "Mark Gatiss", "Benedict Cumberbatch", 2010, 9.1));
        shows.add(ContentFactory.createContent("tvshow", "The Mandalorian", "Sci-Fi", "Jon Favreau", "Pedro Pascal", 2019, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "The Witcher", "Fantasy", "Lauren Schmidt", "Henry Cavill", 2019, 8.1));
        shows.add(ContentFactory.createContent("tvshow", "Dark", "Mystery", "Baran bo Odar", "Louis Hofmann", 2017, 8.8));
        shows.add(ContentFactory.createContent("tvshow", "Peaky Blinders", "Crime", "Steven Knight", "Cillian Murphy", 2013, 8.8));
        shows.add(ContentFactory.createContent("tvshow", "Better Call Saul", "Crime", "Vince Gilligan", "Bob Odenkirk", 2015, 8.9));
        shows.add(ContentFactory.createContent("tvshow", "House of Cards", "Drama", "Beau Willimon", "Kevin Spacey", 2013, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "The Boys", "Action", "Eric Kripke", "Karl Urban", 2019, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "Ozark", "Crime", "Bill Dubuque", "Jason Bateman", 2017, 8.5));
        shows.add(ContentFactory.createContent("tvshow", "Black Mirror", "Sci-Fi", "Charlie Brooker", "Various", 2011, 8.8));
        shows.add(ContentFactory.createContent("tvshow", "The Queen's Gambit", "Drama", "Scott Frank", "Anya Taylor-Joy", 2020, 8.6));
        shows.add(ContentFactory.createContent("tvshow", "The Last of Us", "Drama", "Craig Mazin", "Pedro Pascal", 2023, 9.0));
        shows.add(ContentFactory.createContent("tvshow", "Fargo", "Crime", "Noah Hawley", "Billy Bob Thornton", 2014, 8.9));
        shows.add(ContentFactory.createContent("tvshow", "Chernobyl", "History", "Craig Mazin", "Jared Harris", 2019, 9.4));
        shows.add(ContentFactory.createContent("tvshow", "Loki", "Action", "Michael Waldron", "Tom Hiddleston", 2021, 8.2));
        shows.add(ContentFactory.createContent("tvshow", "The Flash", "Action", "Greg Berlanti", "Grant Gustin", 2014, 7.5));
        shows.add(ContentFactory.createContent("tvshow", "Arrow", "Action", "Greg Berlanti", "Stephen Amell", 2012, 7.6));
        shows.add(ContentFactory.createContent("tvshow", "The Big Bang Theory", "Comedy", "Chuck Lorre", "Jim Parsons", 2007, 8.2));
        shows.add(ContentFactory.createContent("tvshow", "How I Met Your Mother", "Comedy", "Carter Bays", "Josh Radnor", 2005, 8.3));
        shows.add(ContentFactory.createContent("tvshow", "Brooklyn Nine-Nine", "Comedy", "Dan Goor", "Andy Samberg", 2013, 8.4));
        shows.add(ContentFactory.createContent("tvshow", "Dexter", "Crime", "James Manos Jr.", "Michael C. Hall", 2006, 8.6));
        shows.add(ContentFactory.createContent("tvshow", "Narcos", "Biography", "Chris Brancato", "Wagner Moura", 2015, 8.8));
        shows.add(ContentFactory.createContent("tvshow", "Lost", "Adventure", "J.J. Abrams", "Matthew Fox", 2004, 8.3));
        shows.add(ContentFactory.createContent("tvshow", "Prison Break", "Action", "Paul Scheuring", "Wentworth Miller", 2005, 8.3));
        shows.add(ContentFactory.createContent("tvshow", "Suits", "Drama", "Aaron Korsh", "Gabriel Macht", 2011, 8.4));
        shows.add(ContentFactory.createContent("tvshow", "House", "Drama", "David Shore", "Hugh Laurie", 2004, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "Lucifer", "Crime", "Tom Kapinos", "Tom Ellis", 2016, 8.1));
        shows.add(ContentFactory.createContent("tvshow", "The Simpsons", "Animation", "Matt Groening", "Dan Castellaneta", 1989, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "Rick and Morty", "Animation", "Dan Harmon", "Justin Roiland", 2013, 9.1));
        shows.add(ContentFactory.createContent("tvshow", "BoJack Horseman", "Animation", "Raphael Bob-Waksberg", "Will Arnett", 2014, 8.7));
        shows.add(ContentFactory.createContent("tvshow", "Mindhunter", "Crime", "Joe Penhall", "Jonathan Groff", 2017, 8.6));
        shows.add(ContentFactory.createContent("tvshow", "GLOW", "Drama", "Liz Flahive", "Alison Brie", 2017, 8.0));
        shows.add(ContentFactory.createContent("tvshow", "Hannibal", "Crime", "Bryan Fuller", "Mads Mikkelsen", 2013, 8.5));
        shows.add(ContentFactory.createContent("tvshow", "Mr. Robot", "Drama", "Sam Esmail", "Rami Malek", 2015, 8.6));
        shows.add(ContentFactory.createContent("tvshow", "The Umbrella Academy", "Action", "Steve Blackman", "Elliot Page", 2019, 8.0));
        shows.add(ContentFactory.createContent("tvshow", "Money Heist", "Action", "Álex Pina", "Úrsula Corberó", 2017, 8.2));
        shows.add(ContentFactory.createContent("tvshow", "The 100", "Drama", "Jason Rothenberg", "Eliza Taylor", 2014, 7.6));
        shows.add(ContentFactory.createContent("tvshow", "The Expanse", "Sci-Fi", "Mark Fergus", "Steven Strait", 2015, 8.5));
        shows.add(ContentFactory.createContent("tvshow", "True Detective", "Crime", "Nic Pizzolatto", "Matthew McConaughey", 2014, 9.0));
        shows.add(ContentFactory.createContent("tvshow", "The Handmaid's Tale", "Drama", "Bruce Miller", "Elisabeth Moss", 2017, 8.3));
        shows.add(ContentFactory.createContent("tvshow", "The Good Place", "Comedy", "Michael Schur", "Kristen Bell", 2016, 8.2));
        shows.add(ContentFactory.createContent("tvshow", "The Walking Dead", "Horror", "Frank Darabont", "Andrew Lincoln", 2010, 8.1));
        shows.add(ContentFactory.createContent("tvshow", "Severance", "Mystery", "Dan Erickson", "Adam Scott", 2022, 8.7));
        return shows;
    }
}