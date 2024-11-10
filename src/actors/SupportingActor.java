package actors;

public class SupportingActor implements Actor {
    private String name;
    private int age;
    private String character;

    public SupportingActor(String name, int age, String character) {
        this.name = name;
        this.age = age;
        this.character = character;
    }

    public SupportingActor(String name, String character) {
        this.name = name;
        this.character = character;
        this.age = 30; // Default age
    }

    @Override
    public void act() {
        System.out.println(name + " plays a supporting role as " + character);
    }

    @Override
    public void receiveAward() {
        System.out.println(name + " receives a supporting actor award!");
    }
}
