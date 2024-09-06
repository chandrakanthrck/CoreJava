package src.learn.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListWithGenericsTraversals {
    public static void main(String[] args) {
        // Create a LinkedList with generics
        List<Integer> numbers = new LinkedList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        // Traversing using a for-loop
        System.out.println("For-loop traversal:");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        // Traversing using enhanced for-loop
        System.out.println("\nEnhanced for-loop traversal:");
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

        // Real-time use case: Check if a value exists
        if (numbers.contains(20)) {
            System.out.println("\n20 is in the list.");
        }

        // Removing an element
        numbers.remove(Integer.valueOf(30));
        System.out.println("\nList after removing '30': " + numbers);
    }
}
