package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "fig", "grape");

        Map<Integer, Long> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println("Grouped by length: " + groupedByLength);
    }
}
