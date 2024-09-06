package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithGenericsTraversals {
    public static void main(String[] args) {
        // Create an ArrayList with generics
        List<String> fruits = new ArrayList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // Traversing using a for-loop
        System.out.println("For-loop traversal:");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println(fruits.get(i));
        }

        // Traversing using enhanced for-loop
        System.out.println("\nEnhanced for-loop traversal:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Traversing using iterator
        System.out.println("\nIterator traversal:");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traversing using forEach method with lambda
        System.out.println("\nforEach traversal with lambda:");
        fruits.forEach(fruit -> System.out.println(fruit));

        // Real-time use case: Search for a fruit
        if (fruits.contains("Banana")) {
            System.out.println("\nBanana is in the list.");
        }

        // Removing an element
        fruits.remove("Orange");
        System.out.println("\nList after removing 'Orange': " + fruits);

        // Sorting the list (useful for real-time scenarios)
        fruits.sort(String::compareTo);
        System.out.println("\nSorted List: " + fruits);
    }
}