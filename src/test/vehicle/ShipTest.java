package vehicle;

import org.junit.jupiter.api.Test;
import vehicle.car.Car;
import vehicle.Ship;
import vehicle.Vehicle;
import vehicle.car.Gear;

public class ShipTest {
    @Test
    void should_be_protected_method() {
        Ship ship = new Ship();
        ship.isItThatMovingForward();
    }

    @Test
    void super_keyword() {
        Vehicle ship = new Ship();
        System.out.println(ship);
    }

    @Test
    public void this_keyword() {
        Ship ship = new Ship();
        ship.printReference();
        ship.printReferenceObject(this);
        Car car = new Car("ford", 20, Gear.MANUAL);
        ship.printReferenceObject(car);
    }
}
