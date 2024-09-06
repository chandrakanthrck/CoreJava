package src.learn.collections.list.vector;

import java.util.Vector;

public class VectorWithoutGenerics {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("Hello");
        vector.add(123);
        vector.add(true);
        vector.add(12.34);

        // Access elements
        System.out.println("First element: " + vector.firstElement());

        // Check if vector contains an element
        System.out.println("Contains 123: " + vector.contains(123));

        // Remove element by index
        vector.remove(1);
        System.out.println("Vector after removal: " + vector);

        // Iterate over vector
        for (Object obj : vector) {
            System.out.println(obj);
        }

        // Clear the vector
        vector.clear();
        System.out.println("Vector after clear: " + vector);
    }
}
