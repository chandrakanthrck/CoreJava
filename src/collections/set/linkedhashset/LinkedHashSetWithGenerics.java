package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetWithGenerics {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Hello");
        set.add("World");
        set.add("Java");

        // Basic methods
        System.out.println("LinkedHashSet: " + set);

        System.out.println("Contains 'Java': " + set.contains("Java"));
        System.out.println("Size: " + set.size());

        // Removing an element
        set.remove("World");
        System.out.println("After removing 'World': " + set);

        // Iterate using forEach method
        set.forEach(System.out::println);

        // Clear set
        set.clear();
        System.out.println("After clearing: " + set);
    }
}