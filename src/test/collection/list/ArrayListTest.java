package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class ArrayListTest {
    @Test
    void Should_Be_Empty_When_Created() {
        ArrayList<String> string = new ArrayList<>();
        assertThat(string).isEmpty();
    }

    @Test
    void Should_Be_Immutable() {
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Cat");
        animals.add("Fish");

        List<String> unmodifiableAnimals = Collections.unmodifiableList(animals);
        // unmodifiableAnimals.add("Pig"); // doesn't work

        animals.remove("Cat");

    }

    @Test
    void should_reverse_list() {
        // Given
        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");     // index 1
        animals.add("Cat");     // index 2
        animals.add("Cat");     // index 3
        animals.add("Fish");

        List<String> reversedAnimals = new ArrayList<>();
        reversedAnimals.add("Fish");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Cat");
        reversedAnimals.add("Dog");

        // When
        Collections.reverse(animals);

        // Then
        assertThat(animals).isEqualTo(reversedAnimals);
        assertThat(animals.indexOf("Cat")).isEqualTo(1);
        assertThat(animals.lastIndexOf("Cat")).isEqualTo(3);
        assertThat(animals.contains("Cat")).isTrue();
    }

    @Test
    void Should_Return_An_ArrayList_From_An_Array() {
        // Given
        int[] arrayList = {1, 2, 3};

        // When
        Converter converter = new Converter();
        List<Integer> arrayList1 = converter.convert(arrayList);
        arrayList1.remove(1);

        // Then
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        //arrayList2.add(2);
        arrayList2.add(3);

        assertThat(arrayList1).isEqualTo(arrayList2);
    }
    private class Converter {
        public List<Integer> convert(int[] intArray) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i : intArray){
                arrayList.add(i);
            }
            return arrayList;
        }
    }
}
