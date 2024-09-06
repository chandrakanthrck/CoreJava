package src.learn.collections.map.treemap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapWithGenericsTraversals {
    public static void main(String[] args) {
        // Create a TreeMap with generics (automatically sorted by keys)
        Map<String, Integer> items = new TreeMap<>();

        // Adding elements
        items.put("Banana", 20);
        items.put("Apple", 10);
        items.put("Mango", 40);
        items.put("Orange", 30);

        // Traversing using for-each loop for map entries
        System.out.println("For-each loop traversal:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("Item: " + entry.getKey() + ", Quantity: " + entry.getValue());
        }

        // Traversing using forEach method with lambda
        System.out.println("\nforEach traversal with lambda:");
        items.forEach((key, value) -> System.out.println("Item: " + key + ", Quantity: " + value));

        // Real-time use case: Get the lowest and highest key
        System.out.println("\nFirst key: " + ((TreeMap<String, Integer>) items).firstKey());
        System.out.println("Last key: " + ((TreeMap<String, Integer>) items).lastKey());

        // Removing an item
        items.remove("Mango");
        System.out.println("\nMap after removing 'Mango': " + items);
    }
}