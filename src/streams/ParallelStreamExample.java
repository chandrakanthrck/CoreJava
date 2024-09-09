package streams;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        long count = numbers.parallelStream()
                .filter(n -> n % 2 == 0)
                .count();

        System.out.println("Count of even numbers: " + count);
    }
}
