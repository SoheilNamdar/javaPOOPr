package collection.list;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {
    @Test
    void Should_Be_Empty_When_Created() {
        ArrayList<String> string = new ArrayList<>();
        Assertions.assertThat(string).isEmpty();
    }

    @Test
    void Should_Return_An_ArrayList_From_An_Array() {
        // Given
        int[] arrayNumber = {1,2,3,3};

        // When
        Converter converter = new Converter();
        List<Integer> arrayListNumber = converter.convertList(arrayNumber);
        arrayListNumber.add(4,99);

        // Then
        List<Integer> integerList = new ArrayList<>();
        integerList.add(0,1);
        integerList.add(1,2);
        integerList.add(2,3);
        integerList.add(3,3);
        integerList.add(4,99);
        Assertions.assertThat(arrayListNumber).isEqualTo(integerList);
    }

    private class Converter {
        public List<Integer> convertList(int[] arrayNumber) {
            List<Integer> listNumbers = new ArrayList<>();
            for (int number : arrayNumber) {
                listNumbers.add(number);
            }
            System.out.println(listNumbers);
            return listNumbers;
        }
    }
}
