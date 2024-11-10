package genres;

public abstract class Genre {
    protected String type;

    public Genre(String type) {
        this.type = type;
    }

    public Genre() {
        this.type = "Unknown";
    }

    public abstract String getType();

    public void setType(String type) {
        this.type = type;
    }
}
