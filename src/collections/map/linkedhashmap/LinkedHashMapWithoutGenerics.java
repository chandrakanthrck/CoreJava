package collections.map.linkedhashmap;

import java.util.LinkedHashMap;

public class LinkedHashMapWithoutGenerics {
    public static void main(String[] args) {
        // Creating a LinkedHashMap without generics
        LinkedHashMap map = new LinkedHashMap();

        // Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Orange", 4);

        // Accessing elements
        System.out.println("Value of 'Apple': " + map.get("Apple"));

        // Iterating through the map
        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Removing an element
        map.remove("Banana");

        // Checking size of the map
        System.out.println("Size of the map: " + map.size());
    }
}