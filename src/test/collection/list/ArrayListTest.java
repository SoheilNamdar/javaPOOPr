package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class ArrayListTest {
    @Test
    void Should_Be_Empty_When_Created() {
        ArrayList<String> string = new ArrayList<>();

        Assertions.assertThat(string).isEmpty();
    }
}
