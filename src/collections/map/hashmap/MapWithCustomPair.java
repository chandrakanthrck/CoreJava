package collections.map.hashmap;

import java.util.HashMap;
import java.util.Map;

public class MapWithCustomPair {
    public static void main(String[] args) {
        // Creating a map that uses Pair as value
        Map<String, Pair> map = new HashMap<>();
        map.put("Item1", new Pair("Apple", 5));
        map.put("Item2", new Pair("Banana", 10));

        // Iterating over the map with Pair
        for (Map.Entry<String, Pair> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Pair: " + entry.getValue());
        }
    }
}