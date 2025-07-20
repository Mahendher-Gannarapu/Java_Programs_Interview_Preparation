package Interview_PreparationApril2025.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class HowDoYouIterateOverMap {
    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Apple", 3);
        map.put("Banana", 2);
        map.put("Orange", 5);
        System.out.println(map);

        // Iterating using entrySet
        for(Map.Entry<String,Integer> entry : map.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
