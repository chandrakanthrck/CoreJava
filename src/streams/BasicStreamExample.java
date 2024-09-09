package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BasicStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Joe");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered and mapped names: " + filteredNames);
    }
}
