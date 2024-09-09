package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectToSetExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jane");

        Set<String> uniqueNames = names.stream()
                .collect(Collectors.toSet());

        System.out.println("Unique names: " + uniqueNames);
    }
}
