package studios;

import movies.Movie;

public class HollywoodStudio extends Studio {

    public HollywoodStudio(String name, String location, int budget) {
        super(name, location, budget);
    }

    @Override
    public void produceMovie(Movie movie) {
        System.out.println(name + " produces a high-budget movie: " + movie.getTitle());
    }
}
