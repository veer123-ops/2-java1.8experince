package veer.com;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        // Sample array with duplicates
        Integer[] arrayWithDuplicates = {1, 2, 3, 4, 2, 5, 6, 3, 7, 8, 1, 9, 10, 8};

        // Create a HashSet to store unique elements
        Set<Integer> uniqueElementsSet = new HashSet<>(Arrays.asList(arrayWithDuplicates));

        // Convert the HashSet back to an array without duplicates
        Integer[] arrayWithoutDuplicates = uniqueElementsSet.toArray(new Integer[uniqueElementsSet.size()]);

        // Print the array without duplicates
        System.out.println("Array without duplicates:");
        for (int num : arrayWithoutDuplicates) {
            System.out.print(num + " ");
        }
    }
}
