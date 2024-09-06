package collections.set.treeset;

import java.util.TreeSet;

public class TreeSetWithoutGenerics {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();
        set.add(34);
        set.add(12);
        set.add(45);
        set.add(23);

        // Iterate over set (sorted in natural order)
        System.out.println("TreeSet: " + set);

        // Access first and last elements
        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        // Remove element
        set.remove(12);
        System.out.println("After removing 12: " + set);

        // Clear the set
        set.clear();
        System.out.println("After clearing: " + set);
    }
}