import vehicle.Car;
import vehicle.Driver;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {
    @Test
    void car_should_start_when_doorIsClosed_and_engineIsOn() {

        Car benz = new Car("Benz");
        Car volvo = new Car("Volvo");

        boolean isItThatMovingForward = benz.isItThatMovingForward();
        volvo.startEngine();
        boolean itThatMovingForward = volvo.isItThatMovingForward();

        assertFalse(isItThatMovingForward);
        assertTrue(itThatMovingForward);
    }
}

