package collections.map.treemap;

import java.util.TreeMap;

public class TreeMapWithoutGenerics {
    public static void main(String[] args) {
        // Creating a TreeMap without generics
        TreeMap map = new TreeMap();

        // Adding key-value pairs (TreeMap maintains sorted order by key)
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
        map.remove("Cherry");

        // Checking size of the map
        System.out.println("Size of the map: " + map.size());
    }
}