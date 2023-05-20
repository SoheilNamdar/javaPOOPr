package vehicle;

import org.junit.jupiter.api.Test;
import vehicle.car.Gear;

public class EnumTest {
    @Test
    void should_print_enum_values() {
        Gear.print();
    }

    @Test
    void should_print_in_french() {
        System.out.println("En français:");
        Gear.printToFrench();
    }
    @Test
    void should_print_in_persian() {
        System.out.println("Be farsi:");
        Gear.printToPersian();
    }
}
