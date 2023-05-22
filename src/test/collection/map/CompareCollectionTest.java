package collection.map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.car.Car;
import vehicle.car.Gear;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CompareCollectionTest {
    @Test
    void should_compare_non_hash_collections() {
        List<Car> car_1 = new ArrayList<>();
        car_1.add(new Car("BMW", 150, Gear.AUTOMATIC));

        List<Car> car_2 = new ArrayList<>();
        car_2.add(new Car("BMW", 150, Gear.AUTOMATIC));

        assertEquals(car_1,car_2);
        assertEquals(car_1, car_2);
    }
    @Test
    void should_compare_hash_collections() {
        Set<Car> car_1 = new HashSet<>();
        car_1.add(new Car("BMW", 150, Gear.AUTOMATIC));

        Set<Car> car_2 = new HashSet<>();
        car_2.add(new Car("BMW", 150, Gear.AUTOMATIC));

        assertEquals(car_1,car_2);
        assertTrue(car_1.equals(car_2));
    }
}
