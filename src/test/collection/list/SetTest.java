package collection.list;

import org.junit.jupiter.api.Test;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import static org.assertj.core.api.Assertions.assertThat;

public class SetTest {
    @Test
    void should_remove_duplications() {
        Set<String> animals = new HashSet<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Fish");

        Set<String> expectedAnimals = new HashSet<>();
        expectedAnimals.add("Dog");
        expectedAnimals.add("Cat");
        expectedAnimals.add("Fish");

        assertThat(animals).isEqualTo(expectedAnimals);

        // Any duplicate, Order is not important
        for (String s : animals)
            System.out.println(s);
    }

    @Test
    void should_maintain_insertion_order() {
        Set<String> fruit = new LinkedHashSet<>();
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Mandarin");
        fruit.add("Mandarin");
        fruit.add("apple");

        // Any duplicate, Order is important
        for (String s : fruit)
            System.out.println(s);
    }
}
