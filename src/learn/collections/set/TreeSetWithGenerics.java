package src.learn.collections.set;

import java.util.TreeSet;

public class TreeSetWithGenerics {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(34);
        set.add(12);
        set.add(45);
        set.add(23);

        // Display set (sorted order)
        System.out.println("TreeSet: " + set);

        // Access first and last elements
        System.out.println("First: " + set.first());
        System.out.println("Last: " + set.last());

        // Remove element
        set.remove(23);
        System.out.println("After removing 23: " + set);

        // Check ceiling and floor (nearest values)
        System.out.println("Ceiling for 20: " + set.ceiling(20));
        System.out.println("Floor for 40: " + set.floor(40));

        // Clear set
        set.clear();
        System.out.println("After clearing: " + set);
    }
}