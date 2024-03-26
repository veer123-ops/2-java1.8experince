package veer.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 10, 8);

        // Using Java 8 streams to find duplicate elements
        Map<Integer, Long> frequencyMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        // Filter the frequency map to get duplicate elements
        List<Integer> duplicates = frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Print the duplicate elements
        System.out.println("Duplicate elements in the list: " + duplicates);
    }
}
