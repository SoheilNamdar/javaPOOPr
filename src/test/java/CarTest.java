import vehicle.Car;
import org.junit.jupiter.api.Test;
import vehicle.Vehicle;

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
}

