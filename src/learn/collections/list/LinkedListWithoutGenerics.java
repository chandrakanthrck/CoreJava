package src.learn.collections.list;

import java.util.LinkedList;

public class LinkedListWithoutGenerics {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Hello");
        list.add(123);
        list.add(true);
        list.add(12.34);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());

        // Add element at specific index
        list.add(1, "Inserted Element");
        System.out.println("List after insert: " + list);

        // Remove element
        list.remove(2);
        System.out.println("List after removal: " + list);

        // Iterate over list
        for (Object obj : list) {
            System.out.println(obj);
        }

        // Clear the list
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
