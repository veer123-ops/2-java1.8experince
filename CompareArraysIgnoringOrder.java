package veer.com;

import java.util.Arrays;

public class CompareArraysIgnoringOrder {
    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 7};
        int[] arr2 = {2,  5, 7,8};

        boolean areEqual = compareArraysIgnoringOrder(arr1, arr2);

        if (areEqual) {
            System.out.println("The arrays are the same ");
        } else {
            System.out.println("The arrays are different.");
        }
    }

    public static boolean compareArraysIgnoringOrder(int[] arr1, int[] arr2) {
        // Check if array lengths are different
        if (arr1.length != arr2.length) {
            return false;
        }

        // Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Compare sorted arrays element by element
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Found a difference, arrays are different
            }
        }

        // No differences found, arrays are the same (ignoring order)
        return true;
    }
}
