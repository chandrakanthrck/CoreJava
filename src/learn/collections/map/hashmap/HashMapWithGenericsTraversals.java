package src.learn.collections.map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapWithGenericsTraversals {
    public static void main(String[] args) {
        // Create a HashMap with generics
        Map<String, Integer> items = new HashMap<>();

        // Adding elements
        items.put("Apple", 10);
        items.put("Banana", 20);
        items.put("Orange", 30);
        items.put("Mango", 40);

        // Traversing using for-each loop for map entries
        System.out.println("For-each loop traversal:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        // Traversing using iterator
        System.out.println("\nIterator traversal:");
        Iterator<Map.Entry<String, Integer>> iterator = items.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        // Traversing using forEach method with lambda
        System.out.println("\nforEach traversal with lambda:");
        items.forEach((key, value) -> System.out.println("Item: " + key + ", Quantity: " + value));

        // Real-time use case: Check if an item exists and update its value
        if (items.containsKey("Banana")) {
            items.put("Banana", 25); // Update quantity
            System.out.println("\nUpdated quantity of 'Banana': " + items.get("Banana"));
        }

        // Removing an item
        items.remove("Orange");
        System.out.println("\nMap after removing 'Orange': " + items);
    }
}