package generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExamples {
    public static void main(String[] args) {
        // 1. Generic Class Example
        Box<Integer> intBox = new Box<>(123);
        Box<String> strBox = new Box<>("Hello");
        System.out.println(intBox);
        System.out.println(strBox);

        // 2. Generic Method Example
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};
        Utils.printArray(intArray);
        Utils.printArray(strArray);

        // 3. Bounded Type Parameter
        System.out.println("Sum of 5 and 10: " + Utils.sum(5, 10));
        System.out.println("Sum of 3.5 and 4.5: " + Utils.sum(3.5, 4.5));

        // 4. Wildcard Example
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        Utils.printList(intList);

        List<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        Utils.printList(strList);

        // 5. Upper Bounded Wildcard Example
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.1);
        doubleList.add(2.2);
        Utils.printUpperBoundedList(doubleList);

        // 6. Lower Bounded Wildcard Example
        List<Number> numList = new ArrayList<>();
        Utils.addToNumberList(numList);
        System.out.println(numList);

        // 7. Collections with Generics
        List<Box<String>> boxes = new ArrayList<>();
        boxes.add(new Box<>("First"));
        boxes.add(new Box<>("Second"));
        boxes.add(new Box<>("Third"));
        for (Box<String> box : boxes) {
            System.out.println(box.getValue());
        }
    }
}
