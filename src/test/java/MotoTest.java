import org.junit.jupiter.api.Assertions;
import vehicle.Motor;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MotoTest {
    @Test
    void motor_should_start_when_engineIsOn() {
        Motor motor = new Motor();

        motor.startEngine();
        boolean itThatMovingForward = motor.isItThatMovingForward();

        Assertions.assertTrue(itThatMovingForward);
    }
}
