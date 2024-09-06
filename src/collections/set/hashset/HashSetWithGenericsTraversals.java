package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetWithGenericsTraversals {
    public static void main(String[] args) {
        // Create a HashSet with generics
        Set<String> cities = new HashSet<>();

        // Adding elements
        cities.add("New York");
        cities.add("San Francisco");
        cities.add("Los Angeles");
        cities.add("Chicago");

        // Traversing using enhanced for-loop
        System.out.println("Enhanced for-loop traversal:");
        for (String city : cities) {
            System.out.println(city);
        }

        // Traversing using iterator
        System.out.println("\nIterator traversal:");
        Iterator<String> iterator = cities.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traversing using forEach method with lambda
        System.out.println("\nforEach traversal with lambda:");
        cities.forEach(city -> System.out.println(city));

        // Real-time use case: Check if a city exists
        if (cities.contains("Chicago")) {
            System.out.println("\nChicago is in the set.");
        }

        // Removing an element
        cities.remove("Los Angeles");
        System.out.println("\nSet after removing 'Los Angeles': " + cities);
    }
}