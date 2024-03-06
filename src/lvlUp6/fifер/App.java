package lvlUp6.fifер;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car(4, 3);
        Car car2 = new Car(1, 5);
        Car car3 = new Car(2, 6);

        Car[] cars = {car1, car2, car3};

        Car toSearch = new Car(1, 5);

        for (Car car : cars) {
            if (car.equals(toSearch)) {
                System.out.println("BINGO!!!");
            }
        }
    }
}
