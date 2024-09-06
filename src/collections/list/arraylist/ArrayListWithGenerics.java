package collections.list.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListWithGenerics {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Generics in Java");

        // Add element at specific index
        list.add(1, "Inserted Element");

        // Get element by index
        System.out.println("Element at index 1: " + list.get(1));

        // Sort list
        Collections.sort(list);
        System.out.println("Sorted list: " + list);

        // Remove element
        list.remove("Hello");
        System.out.println("List after removal: " + list);

        // Iterate over list
        list.forEach(System.out::println);

        // Clear list
        list.clear();
        System.out.println("List after clear: " + list);
    }
}
