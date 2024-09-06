package src.learn.collections.list.arraylist;

import java.util.ArrayList;

public class ArrayListWithoutGenerics {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Hello");
        list.add(123);
        list.add(true);
        list.add(12.34);

        // Access elements
        System.out.println("Element at index 0: " + list.get(0));

        // Check size
        System.out.println("Size of list: " + list.size());

        // Check if list contains an element
        System.out.println("Contains 'Hello': " + list.contains("Hello"));

        // Remove an element
        list.remove(2);
        System.out.println("After removing index 2: " + list);

        // Iterate over list
        for (Object obj : list) {
            System.out.println(obj);
        }

        // Clear the list
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
