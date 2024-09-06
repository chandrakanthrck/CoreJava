package collections.set.linkedhashset;

import java.util.LinkedHashSet;

public class LinkedHashSetWithoutGenerics {
    public static void main(String[] args) {
        LinkedHashSet set = new LinkedHashSet();
        set.add("First");
        set.add(123);
        set.add(true);
        set.add(12.34);

        // Iterate and display set (maintains insertion order)
        System.out.println("LinkedHashSet: " + set);

        // Check operations
        System.out.println("Contains 123: " + set.contains(123));
        System.out.println("Size: " + set.size());

        // Remove element
        set.remove(123);
        System.out.println("After removing 123: " + set);

        // Iterate using for-each
        for (Object obj : set) {
            System.out.println(obj);
        }

        // Clear set
        set.clear();
        System.out.println("After clearing: " + set);
    }
}