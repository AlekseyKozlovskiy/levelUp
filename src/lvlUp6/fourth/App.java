package lvlUp6.fourth;

public class App {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal cat = new Cat("whiskas", "home", true);
        Dog dog = new Dog("bones", "kennel", true);
        Horse horse = new Horse("seno", "street", 4);

        Animal[] animals = {cat, dog, horse};

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
