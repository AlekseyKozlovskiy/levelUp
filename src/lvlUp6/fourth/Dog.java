package lvlUp6.fourth;

public class Dog extends Animal {
    private Boolean lovesЕheOwner = true;

    public Dog(String food, String location, Boolean lovesЕheOwner) {
        super(food, location);
        this.lovesЕheOwner = lovesЕheOwner;
    }

    @Override
    public void sleep() {
        System.out.println("The Dog is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("GAV GAV GAV");
    }

    @Override
    public void eat() {
        System.out.println("The Dog is eating");
    }
}
