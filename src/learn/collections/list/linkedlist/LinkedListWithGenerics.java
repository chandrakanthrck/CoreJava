package src.learn.collections.list.linkedlist;

import java.util.LinkedList;

public class LinkedListWithGenerics {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("Generics in Java");

        // Add element at the beginning and end
        list.addFirst("First Element");
        list.addLast("Last Element");

        // Get first and last elements
        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());

        // Remove first and last elements
        list.removeFirst();
        list.removeLast();

        // Iterate over list
        list.forEach(System.out::println);

        // Clear list
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
