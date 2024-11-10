package actors;

public class LeadActor implements Actor {
    private String name;
    private int age;
    private String character;

    public LeadActor(String name, int age, String character) {
        this.name = name;
        this.age = age;
        this.character = character;
    }

    public LeadActor(String name, String character) {
        this.name = name;
        this.character = character;
        this.age = 30; // Default age
    }

    @Override
    public void act() {
        System.out.println(name + " plays the lead role as " + character);
    }

    @Override
    public void receiveAward() {
        System.out.println(name + " receives an award for best performance!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

