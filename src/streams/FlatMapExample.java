package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapExample {
    public static void main(String[] args) {
        List<List<String>> nestedList = Arrays.asList(
                Arrays.asList("apple", "banana"),
                Arrays.asList("cherry", "date"),
                Arrays.asList("fig", "grape")
        );

        List<String> flattenedList = nestedList.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println("Flattened list: " + flattenedList);
    }
}
