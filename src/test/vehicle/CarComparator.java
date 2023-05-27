package vehicle;

import vehicle.car.Car;
import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car_1, Car car_2) {
        return car_1.getBrand().compareTo(car_2.getBrand());
    }
}
