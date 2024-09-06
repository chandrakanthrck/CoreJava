package collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithGenerics {
    public static void main(String[] args) {
        // Creating a TreeMap with generics
        Map<String, Integer> map = new TreeMap<>();

        // Adding key-value pairs (TreeMap maintains sorted order by key)
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Orange", 4);

        // Accessing elements
        System.out.println("Value of 'Apple': " + map.get("Apple"));

        // Iterating through the map
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Removing an element
        map.remove("Banana");

        // Checking size of the map
        System.out.println("Size of the map: " + map.size());
    }
}