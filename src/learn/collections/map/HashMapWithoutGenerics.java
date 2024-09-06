package src.learn.collections.map;

import java.util.HashMap;

public class HashMapWithoutGenerics {
    public static void main(String[] args) {
        // Creating a HashMap without generics
        HashMap map = new HashMap();

        // Adding key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Orange", 4);

        // Accessing elements
        System.out.println("Value of 'Apple': " + map.get("Apple"));

        // Checking if a key exists
        System.out.println("Contains 'Banana': " + map.containsKey("Banana"));

        // Checking if a value exists
        System.out.println("Contains value 3: " + map.containsValue(3));

        // Iterating through the map
        for (Object key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }

        // Removing an element
        map.remove("Cherry");

        // Checking size of the map
        System.out.println("Size of the map: " + map.size());

        // Clearing the map
        map.clear();
        System.out.println("Map after clearing: " + map);
    }
}