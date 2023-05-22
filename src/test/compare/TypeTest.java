package compare;

import org.junit.jupiter.api.Test;
import java.util.Objects;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TypeTest {
    @Test
    void should_compare_primitive_objects() {
        assertTrue(1 == 1);
        assertFalse(1.2 != 1.2);
    }

    @Test
    void should_compare_nonPrimitive_objects() {
        String soheil = new String("Soheil");
        String soheil1 = new String("Soheil");

        assertTrue(soheil.equals(soheil1));
        assertThat(soheil.equals(soheil1)).isTrue();

        String soheil2 = "SOHEIL";
        assertTrue(soheil.equalsIgnoreCase(soheil2));

        String s1 = "soheil";
        String s2 = "soheil";
        assertTrue(s1.equals(s2));
    }

    @Test
    void should_handle_null_objects() {
        String s2 = "Soheil";

        assertFalse(Objects.equals(null,s2));
    }
}
