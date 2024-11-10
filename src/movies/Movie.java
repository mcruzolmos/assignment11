package movies;

import genres.Genre;

public abstract class Movie {
    protected String title;
    protected int releaseYear;
    protected Genre genre;

    public Movie(String title, int releaseYear, Genre genre) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre;
    }

    public Movie(String title) {
        this.title = title;
        this.releaseYear = 0; // Default year
        this.genre = null; // Default genre
    }

    public abstract void play();

    @Override
    public String toString() {
        return "Movie Title: " + title + ", Released: " + releaseYear + ", Genre: " + genre.getType();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
