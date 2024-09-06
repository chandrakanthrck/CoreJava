package src.learn.collections.set;

import java.util.HashSet;

public class HashSetWithoutGenerics {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("Hello");
        set.add(123);
        set.add(true);
        set.add(12.34);

        // Basic methods
        System.out.println("Set: " + set);
        System.out.println("Size of set: " + set.size());
        System.out.println("Contains 'Hello': " + set.contains("Hello"));
        System.out.println("Is set empty: " + set.isEmpty());

        // Removing elements
        set.remove(123);
        System.out.println("After removing 123: " + set);

        // Iterate over set
        for (Object obj : set) {
            System.out.println(obj);
        }

        // Clear set
        set.clear();
        System.out.println("After clearing: " + set);
    }
}