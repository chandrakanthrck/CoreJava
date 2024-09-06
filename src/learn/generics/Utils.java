package src.learn.generics;

import java.util.List;

// Utility Class with Generic Methods
public class Utils {

    // Generic Method Example
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Bounded Type Parameter (restricting T to only Number types)
    public static <T extends Number> double sum(T num1, T num2) {
        return num1.doubleValue() + num2.doubleValue();
    }

    // Wildcard Example
    public static void printList(List<?> list) {
        for (Object element : list) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Upper Bounded Wildcard Example
    public static void printUpperBoundedList(List<? extends Number> list) {
        for (Number number : list) {
            System.out.print(number + " ");
        }
        System.out.println();
    }

    // Lower Bounded Wildcard Example
    public static void addToNumberList(List<? super Integer> list) {
        list.add(10);
        list.add(20);
    }
}
