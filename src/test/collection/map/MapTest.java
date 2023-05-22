package collection.map;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    @Test
    void should_have_unique_key_and_multiple_values() {
        Map<String, String> stringStringLinkedMap = new LinkedHashMap<>(); // when order is important

        Map<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("circle","red");
        stringStringHashMap.put("rectangular","yellow");
        stringStringHashMap.put("square","green");
        stringStringHashMap.put("square","orange");

        for (Map.Entry<String,String> entries : stringStringHashMap.entrySet()){
            String key = entries.getKey();
            String value = entries.getValue();
            System.out.println("Key is : " + key + ", Value is : " + value);
        }
    }
}
