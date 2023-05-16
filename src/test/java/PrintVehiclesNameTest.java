import org.junit.jupiter.api.Test;
import vehicle.*;
import static org.junit.jupiter.api.Assertions.*;

public class PrintVehiclesNameTest {
    @Test
    void shouldPrintVehiclesName() {
        Vehicle car = new Car("Benz", 120, "Automatic");
        Vehicle car1 = new Car("Volvo", 80, "Manual");
        Vehicle motor = new Motor();
        Vehicle ship = new Ship();
        Vehicle[] vehicles = {car, car1, motor, ship};
        PrintName printName = new PrintName(vehicles);

        String carList = printName.execute();

        assertEquals("Benz-Volvo-Motor-Ship", carList);
    }
}
