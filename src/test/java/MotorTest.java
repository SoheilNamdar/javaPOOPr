import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.Motor;
import vehicle.Vehicle;

import static org.junit.jupiter.api.Assertions.*;

public class MotorTest {
    @Test
    void motor_should_start_when_engineIsOn() {
        // Given
        Vehicle motor = new Motor();

        // When
        motor.startEngine();
        boolean itThatMovingForward = motor.isItThatMovingForward();

        // Then
        assertTrue(itThatMovingForward);
    }
}
