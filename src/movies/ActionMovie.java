package movies;

import genres.Genre;

public class ActionMovie extends Movie {
    private String specialEffect;

    public ActionMovie(String title, int releaseYear, Genre genre, String specialEffect) {
        super(title, releaseYear, genre);
        this.specialEffect = specialEffect;
    }

    public ActionMovie(String title) {
        super(title);
        this.specialEffect = "None"; // Default effect
    }

    @Override
    public void play() {
        System.out.println("Playing action-packed movie: " + getTitle());
    }

    @Override
    public String toString() {
        return super.toString() + ", Special Effects: " + specialEffect;
    }

    public void setSpecialEffect(String specialEffect) {
        this.specialEffect = specialEffect;
    }

    public String getSpecialEffect() {
        return specialEffect;
    }
}
