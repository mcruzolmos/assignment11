import movies.*;
import actors.*;
import studios.*;
import genres.*;

public class MovieProject {
    public static void main(String[] args) {
        Movie actionMovie = new ActionMovie("Avengers", 2019, new ActionGenre(), "Endgame");
        Movie dramaMovie = new DramaMovie("The Pursuit of Happyness", 2006, new DramaGenre(), "Happiness");

        System.out.println(actionMovie.toString());
        System.out.println(dramaMovie.toString());

        Actor leadActor = new LeadActor("Robert Downey Jr.", 55, "Iron Man");
        Actor supportingActor = new SupportingActor("Chris Evans", 42, "Captain America");

        Studio hollywoodStudio = new HollywoodStudio("Marvel Studios", "California", 1000);
        Studio indieStudio = new IndependentStudio("A24 Films", "New York", 100);

        hollywoodStudio.produceMovie(actionMovie);
        indieStudio.produceMovie(dramaMovie);
    }
}

