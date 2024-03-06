package lvlUp6.fourth;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public void makeNoise(){

    }
    public void eat() {

    }

    public void sleep() {
        System.out.println("Somebody is sleeping");
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }
}
