package veer.com;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicatesInList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 10, 8);

        // Group elements by their occurrence count
        Map<Integer, Long> elementCountMap = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));

        // Filter duplicate elements (occurrence count > 1)
        List<Integer> duplicates = elementCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        // Print the duplicate elements
        System.out.println("Duplicate elements in the list: " + duplicates);
    }
}
