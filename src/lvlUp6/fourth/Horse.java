package lvlUp6.fourth;

public class Horse extends Animal {
    private int countOfHooves = 4;

    public Horse(String food, String location, int countOfHooves) {
        super(food, location);
        this.countOfHooves = countOfHooves;
    }

    @Override
    public void sleep() {
        System.out.println("The Horse is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("I-GO-GO");
    }

    @Override
    public void eat() {
        System.out.println("The Horse is eating");

    }
}
