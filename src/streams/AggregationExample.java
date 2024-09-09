package streams;

import java.util.Arrays;
import java.util.List;

public class AggregationExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        double average = numbers.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
