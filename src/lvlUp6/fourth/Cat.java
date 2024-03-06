package lvlUp6.fourth;

public class Cat extends  Animal {
    private Boolean purr = true;

    public Cat(String food, String location, Boolean purr) {
        super(food, location);
        this.purr = purr;
    }

    @Override
    public void sleep() {
        System.out.println("The Cat is sleeping");
    }

    @Override
    public void makeNoise() {
        System.out.println("MEOW MEOW MEOW");
    }

    @Override
    public void eat() {
        System.out.println("The Cat is eating");

    }
}
