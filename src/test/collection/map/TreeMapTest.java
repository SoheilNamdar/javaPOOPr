package collection.map;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.TreeMap;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TreeMapTest {
    @Test
    void Should_sort_elements() {
        TreeMap<String, String> stringStringTreeMap = new TreeMap<>();
        stringStringTreeMap.put("rectangular","yellow");
        stringStringTreeMap.put("circle","red");
        stringStringTreeMap.put("triangle","white");
        stringStringTreeMap.put("square","green");

        Object[] objects = stringStringTreeMap.keySet().toArray();
        assertThat(objects[1]).isEqualTo("rectangular");
        assertThat(objects[3]).isEqualTo("triangle");
        assertThat(objects[2]).isEqualTo("square");
        assertThat(objects[0]).isEqualTo("circle");

        //assertThat(Arrays.stream(objects).findFirst()).isEqualTo(Optional[circle]);
    }

    @Test
    void Should_sort_elements_in_reverse_order() {
        TreeMap<String, String> stringStringTreeMap = new TreeMap<>(Comparator.reverseOrder());
        stringStringTreeMap.put("rectangular","yellow");
        stringStringTreeMap.put("circle","red");
        stringStringTreeMap.put("triangle","white");
        stringStringTreeMap.put("square","green");

        Object[] objects = stringStringTreeMap.keySet().toArray();
        assertThat(objects[2]).isEqualTo("rectangular");
        assertThat(objects[0]).isEqualTo("triangle");
        assertThat(objects[1]).isEqualTo("square");
        assertThat(objects[3]).isEqualTo("circle");
    }
}
