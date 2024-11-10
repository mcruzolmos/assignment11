package studios;

import movies.Movie;

public class IndependentStudio extends Studio {

    public IndependentStudio(String name, String location, int budget) {
        super(name, location, budget);
    }

    @Override
    public void produceMovie(Movie movie) {
        System.out.println(name + " produces a low-budget indie movie: " + movie.getTitle());
    }
}
