package lvlUp6.fifер;

import java.util.Objects;

public class Car {
    private int wheels;
    private int doors;

    public Car(int wheels, int doors) {
        this.wheels = wheels;
        this.doors = doors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return wheels == car.wheels && doors == car.doors;
    }

    @Override
    public int hashCode() {
        return Objects.hash(wheels, doors);
    }
}

