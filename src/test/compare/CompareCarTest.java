package compare;

import org.junit.jupiter.api.Test;
import vehicle.car.Car;
import vehicle.car.Gear;

import java.util.Objects;

import static org.assertj.core.api.Assertions.assertThat;

public class CompareCarTest {
    @Test
    void should_compare_test() {
        Car car = new Car("BMW1", 150, Gear.AUTOMATIC);
        Car car1 = new Car("BMW1", 150, Gear.AUTOMATIC);

        assertThat(car.equals(car1));
        assertThat(Objects.equals(car1,car));
        assertThat(car).isEqualTo(car1);
    }
}
