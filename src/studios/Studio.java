package studios;

import movies.Movie;

public abstract class Studio {
    protected String name;
    protected String location;
    protected int budget;

    public Studio(String name, String location, int budget) {
        this.name = name;
        this.location = location;
        this.budget = budget;
    }

    public abstract void produceMovie(Movie movie);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
