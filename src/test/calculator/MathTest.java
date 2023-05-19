package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MathTest {
    @Test
    void Should_do_mathematical_operation() {
        double v = -1.5;
        int v1 = 0;

        double abs = Math.abs(v);
        assertEquals(1.5, abs);

        assertEquals(1, Math.cos(v1));
    }
}
