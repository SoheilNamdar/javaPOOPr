package compare;

import org.junit.jupiter.api.Test;
import vehicle.CarComparator;
import vehicle.car.Car;
import vehicle.car.Gear;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareCarTest {
    @Test
    void should_compare_car() {
        Car car = new Car("BMW1", 150, Gear.AUTOMATIC);
        Car car1 = new Car("BMW1", 150, Gear.AUTOMATIC);

        assertThat(car.equals(car1));
        assertThat(Objects.equals(car1,car));
        assertThat(car).isEqualTo(car1);
    }

    @Test
    void should_sort_car() {
        List<Car> car = new ArrayList<>();
        car.add(new Car("BMW", 140, Gear.MANUAL));
        car.add(new Car("BMW", 100, Gear.AUTOMATIC));
        car.add(new Car("BMW", 50, Gear.MANUAL));
        car.add(new Car("BMW", 50, Gear.AUTOMATIC));

        Collections.sort(car);

        List<Car> sortedCar = new ArrayList<>();
        sortedCar.add(new Car("BMW", 50, Gear.MANUAL));
        sortedCar.add(new Car("BMW", 50, Gear.AUTOMATIC));
        sortedCar.add(new Car("BMW", 100, Gear.AUTOMATIC));
        sortedCar.add(new Car("BMW", 140, Gear.MANUAL));

        assertThat(car).isEqualTo(sortedCar);
    }

    @Test
    void should_sort_car_by_brand() {
        List<Car> car = new ArrayList<>();
        car.add(new Car("BMW", 140, Gear.MANUAL));
        car.add(new Car("Mercedes", 100, Gear.AUTOMATIC));
        car.add(new Car("Peykan", 50, Gear.MANUAL));
        car.add(new Car("Alfa romeo", 50, Gear.AUTOMATIC));

        Collections.sort(car, new CarComparator());

        List<Car> sortedCar = new ArrayList<>();
        sortedCar.add(new Car("Alfa romeo", 50, Gear.AUTOMATIC));
        sortedCar.add(new Car("BMW", 140, Gear.MANUAL));
        sortedCar.add(new Car("Mercedes", 100, Gear.AUTOMATIC));
        sortedCar.add(new Car("Peykan", 50, Gear.MANUAL));

        assertThat(car).isEqualTo(sortedCar);
    }
}
