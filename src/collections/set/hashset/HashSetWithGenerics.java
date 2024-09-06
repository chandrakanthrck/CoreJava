package collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetWithGenerics {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Generics in Java");

        // Add and iterate
        System.out.println("HashSet: " + set);

        // Basic operations
        System.out.println("Contains 'World': " + set.contains("World"));
        System.out.println("Size of set: " + set.size());

        // Iterate using an iterator
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // Remove element
        set.remove("World");
        System.out.println("After removing 'World': " + set);

        // Clear set
        set.clear();
        System.out.println("After clearing: " + set);
    }
}