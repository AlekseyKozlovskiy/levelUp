package skillFactory;

public class Robot {
    String name;
    int health;
    int strong;
    boolean isAlive = true;

    public Robot(String name, int health, int strong) {
        this.name = name;
        this.health = health;
        this.strong = strong;
    }
}
