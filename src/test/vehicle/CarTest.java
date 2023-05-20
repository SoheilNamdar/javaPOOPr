package vehicle;

import vehicle.car.Car;
import org.junit.jupiter.api.Test;
import vehicle.Vehicle;
import vehicle.car.Gear;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void car_should_start_when_doorIsClosed_and_engineIsOn() {

        Vehicle benz = new Car("Benz");
        Vehicle volvo = new Car("Volvo");

        boolean isItThatMovingForward = benz.isItThatMovingForward();
        volvo.startEngine();
        boolean itThatMovingForward = volvo.isItThatMovingForward();

        assertFalse(isItThatMovingForward);
        assertTrue(itThatMovingForward);
    }

    @Test
    void should_print_car() {
        Car car = new Car("Peugeot",140, Gear.MANUAL);
        System.out.println(car.toString());
    }
}

