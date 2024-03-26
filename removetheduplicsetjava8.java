package veer.com;

import java.util.Arrays;
import java.util.stream.Collectors;

public class removetheduplicsetjava8 {
    public static void main(String[] args) {
        Integer[] arrayWithDuplicates = {1, 2, 3, 4, 2, 3, 5}; // Example array with duplicate numbers

        // Convert the array to a stream and use distinct() to remove duplicates
        Integer[] uniqueArray = Arrays.stream(arrayWithDuplicates)
                                      .distinct()
                                      .toArray(Integer[]::new);

        // Print the unique elements
        System.out.println("Unique elements:");
        for (Integer num : uniqueArray) {
        System.out.println(num);
        }}}