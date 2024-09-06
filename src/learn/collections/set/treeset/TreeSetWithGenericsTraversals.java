package src.learn.collections.set.treeset;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithGenericsTraversals {
    public static void main(String[] args) {
        // Create a TreeSet with generics (automatically sorted)
        Set<Integer> numbers = new TreeSet<>();

        // Adding elements
        numbers.add(50);
        numbers.add(20);
        numbers.add(40);
        numbers.add(30);

        // Traversing using enhanced for-loop
        System.out.println("Enhanced for-loop traversal:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        // Traversing using iterator
        System.out.println("\nIterator traversal:");
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Traversing using forEach method with method reference
        System.out.println("\nforEach traversal with method reference:");
        numbers.forEach(System.out::println);

        // Real-time use case: Get the highest number
        System.out.println("\nHighest number: " + ((TreeSet<Integer>) numbers).last());

        // Removing an element
        numbers.remove(30);
        System.out.println("\nSet after removing '30': " + numbers);
    }
}