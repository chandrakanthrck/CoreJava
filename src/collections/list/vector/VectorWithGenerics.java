package collections.list.vector;

import java.util.Vector;

public class VectorWithGenerics {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("Hello");
        vector.add("World");
        vector.add("Generics in Java");

        // Access elements
        System.out.println("First element: " + vector.firstElement());

        // Insert element at index
        vector.add(1, "Inserted Element");
        System.out.println("After insertion: " + vector);

        // Remove element
        vector.remove("World");
        System.out.println("After removal: " + vector);

        // Iterate over vector
        vector.forEach(System.out::println);

        // Clear vector
        vector.clear();
        System.out.println("Vector after clear: " + vector);
    }
}
