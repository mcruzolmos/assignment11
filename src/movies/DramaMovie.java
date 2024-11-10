package movies;

import genres.Genre;

public class DramaMovie extends Movie {
    private String theme;

    public DramaMovie(String title, int releaseYear, Genre genre, String theme) {
        super(title, releaseYear, genre);
        this.theme = theme;
    }

    public DramaMovie(String title) {
        super(title);
        this.theme = "Life"; // Default theme
    }

    @Override
    public void play() {
        System.out.println("Playing emotional drama movie: " + getTitle());
    }

    @Override
    public String toString() {
        return super.toString() + ", Theme: " + theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getTheme() {
        return theme;
    }
}

