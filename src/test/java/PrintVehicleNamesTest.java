import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import vehicle.*;

public class PrintVehicleNamesTest {

    @Test
    void shouldPrintVehicleName() {
        // Given
        Vehicle car = new Car("Benz", 150, "Automatic");
        Vehicle volvo = new Car("Volvo", 80, "Manual");
        Vehicle motor = new Motor();
        Vehicle ship = new Ship();
        Vehicle[] vehicles = {car, volvo, motor, ship};
        PrintName printName = new PrintName(vehicles);

        // When
        String VehiclesList = printName.execute();
        Assertions.assertEquals("Benz-Volvo-Motor", VehiclesList);

    }
}
