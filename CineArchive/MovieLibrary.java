import java.util.*;

public class MovieLibrary {
    public static List<Content> getMovies() {
        List<Content> movies = new ArrayList<>();
        movies.add(ContentFactory.createContent("movie", "Inception", "Sci-Fi", "Christopher Nolan", "Leonardo DiCaprio", 2010, 8.8));
        movies.add(ContentFactory.createContent("movie", "The Matrix", "Sci-Fi", "Lana Wachowski", "Keanu Reeves", 1999, 8.7));
        movies.add(ContentFactory.createContent("movie", "Interstellar", "Sci-Fi", "Christopher Nolan", "Matthew McConaughey", 2014, 8.6));
        movies.add(ContentFactory.createContent("movie", "The Godfather", "Crime", "Francis Ford Coppola", "Marlon Brando", 1972, 9.2));
        movies.add(ContentFactory.createContent("movie", "Pulp Fiction", "Crime", "Quentin Tarantino", "John Travolta", 1994, 8.9));
        movies.add(ContentFactory.createContent("movie", "Fight Club", "Drama", "David Fincher", "Brad Pitt", 1999, 8.8));
        movies.add(ContentFactory.createContent("movie", "Forrest Gump", "Drama", "Robert Zemeckis", "Tom Hanks", 1994, 8.8));
        movies.add(ContentFactory.createContent("movie", "The Shawshank Redemption", "Drama", "Frank Darabont", "Tim Robbins", 1994, 9.3));
        movies.add(ContentFactory.createContent("movie", "The Dark Knight", "Action", "Christopher Nolan", "Christian Bale", 2008, 9.0));
        movies.add(ContentFactory.createContent("movie", "The Lord of the Rings", "Fantasy", "Peter Jackson", "Elijah Wood", 2001, 8.8));
        movies.add(ContentFactory.createContent("movie", "The Social Network", "Biography", "David Fincher", "Jesse Eisenberg", 2010, 7.8));
        movies.add(ContentFactory.createContent("movie", "Gladiator", "Action", "Ridley Scott", "Russell Crowe", 2000, 8.5));
        movies.add(ContentFactory.createContent("movie", "Titanic", "Romance", "James Cameron", "Leonardo DiCaprio", 1997, 7.8));
        movies.add(ContentFactory.createContent("movie", "Avatar", "Sci-Fi", "James Cameron", "Sam Worthington", 2009, 7.9));
        movies.add(ContentFactory.createContent("movie", "Joker", "Drama", "Todd Phillips", "Joaquin Phoenix", 2019, 8.4));
        movies.add(ContentFactory.createContent("movie", "Whiplash", "Drama", "Damien Chazelle", "Miles Teller", 2014, 8.5));
        movies.add(ContentFactory.createContent("movie", "The Prestige", "Mystery", "Christopher Nolan", "Hugh Jackman", 2006, 8.5));
        movies.add(ContentFactory.createContent("movie", "The Lion King", "Animation", "Roger Allers", "Matthew Broderick", 1994, 8.5));
        movies.add(ContentFactory.createContent("movie", "Avengers: Endgame", "Action", "Anthony Russo", "Robert Downey Jr.", 2019, 8.4));
        movies.add(ContentFactory.createContent("movie", "Iron Man", "Action", "Jon Favreau", "Robert Downey Jr.", 2008, 7.9));
        movies.add(ContentFactory.createContent("movie", "Black Panther", "Action", "Ryan Coogler", "Chadwick Boseman", 2018, 7.3));
        movies.add(ContentFactory.createContent("movie", "Doctor Strange", "Fantasy", "Scott Derrickson", "Benedict Cumberbatch", 2016, 7.5));
        movies.add(ContentFactory.createContent("movie", "The Imitation Game", "Biography", "Morten Tyldum", "Benedict Cumberbatch", 2014, 8.0));
        movies.add(ContentFactory.createContent("movie", "Django Unchained", "Western", "Quentin Tarantino", "Jamie Foxx", 2012, 8.4));
        movies.add(ContentFactory.createContent("movie", "Gone Girl", "Mystery", "David Fincher", "Ben Affleck", 2014, 8.1));
        movies.add(ContentFactory.createContent("movie", "Knives Out", "Mystery", "Rian Johnson", "Daniel Craig", 2019, 7.9));
        movies.add(ContentFactory.createContent("movie", "La La Land", "Musical", "Damien Chazelle", "Ryan Gosling", 2016, 8.0));
        movies.add(ContentFactory.createContent("movie", "Coco", "Animation", "Lee Unkrich", "Anthony Gonzalez", 2017, 8.4));
        movies.add(ContentFactory.createContent("movie", "Inside Out", "Animation", "Pete Docter", "Amy Poehler", 2015, 8.1));
        movies.add(ContentFactory.createContent("movie", "Up", "Animation", "Pete Docter", "Ed Asner", 2009, 8.2));
        movies.add(ContentFactory.createContent("movie", "Finding Nemo", "Animation", "Andrew Stanton", "Albert Brooks", 2003, 8.2));
        movies.add(ContentFactory.createContent("movie", "Shrek", "Animation", "Andrew Adamson", "Mike Myers", 2001, 7.9));
        movies.add(ContentFactory.createContent("movie", "The Truman Show", "Drama", "Peter Weir", "Jim Carrey", 1998, 8.2));
        movies.add(ContentFactory.createContent("movie", "The Revenant", "Adventure", "Alejandro G. Iñárritu", "Leonardo DiCaprio", 2015, 8.0));
        movies.add(ContentFactory.createContent("movie", "1917", "War", "Sam Mendes", "George MacKay", 2019, 8.3));
        movies.add(ContentFactory.createContent("movie", "The Grand Budapest Hotel", "Comedy", "Wes Anderson", "Ralph Fiennes", 2014, 8.1));
        movies.add(ContentFactory.createContent("movie", "The Pianist", "Biography", "Roman Polanski", "Adrien Brody", 2002, 8.5));
        movies.add(ContentFactory.createContent("movie", "A Beautiful Mind", "Biography", "Ron Howard", "Russell Crowe", 2001, 8.2));
        movies.add(ContentFactory.createContent("movie", "Good Will Hunting", "Drama", "Gus Van Sant", "Matt Damon", 1997, 8.3));
        movies.add(ContentFactory.createContent("movie", "Dead Poets Society", "Drama", "Peter Weir", "Robin Williams", 1989, 8.1));
        movies.add(ContentFactory.createContent("movie", "Her", "Romance", "Spike Jonze", "Joaquin Phoenix", 2013, 8.0));
        movies.add(ContentFactory.createContent("movie", "Ex Machina", "Sci-Fi", "Alex Garland", "Domhnall Gleeson", 2014, 7.7));
        movies.add(ContentFactory.createContent("movie", "The Big Short", "Biography", "Adam McKay", "Christian Bale", 2015, 7.8));
        movies.add(ContentFactory.createContent("movie", "Memento", "Mystery", "Christopher Nolan", "Guy Pearce", 2000, 8.4));
        movies.add(ContentFactory.createContent("movie", "The Theory of Everything", "Biography", "James Marsh", "Eddie Redmayne", 2014, 7.7));
        movies.add(ContentFactory.createContent("movie", "Catch Me If You Can", "Crime", "Steven Spielberg", "Leonardo DiCaprio", 2002, 8.1));
        movies.add(ContentFactory.createContent("movie", "The Departed", "Crime", "Martin Scorsese", "Leonardo DiCaprio", 2006, 8.5));
        movies.add(ContentFactory.createContent("movie", "Mad Max: Fury Road", "Action", "George Miller", "Tom Hardy", 2015, 8.1));
        movies.add(ContentFactory.createContent("movie", "No Country for Old Men", "Thriller", "Coen Brothers", "Javier Bardem", 2007, 8.1));
        movies.add(ContentFactory.createContent("movie", "The Green Mile", "Drama", "Frank Darabont", "Tom Hanks", 1999, 8.6));
        movies.add(ContentFactory.createContent("movie", "The Silence of the Lambs", "Thriller", "Jonathan Demme", "Jodie Foster", 1991, 8.6));
        return movies;
    }
}