package veer.com;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenOddNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Calculate sum of even numbers using Java 8 streams
        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum();

        // Calculate sum of odd numbers using Java 8 streams
        int sumOfOdds = numbers.stream()
                .filter(num -> num % 2 != 0)
                .mapToInt(Integer::intValue)
                .sum();

        // Print the results
        System.out.println("Sum of even numbers: " + sumOfEvens);
        System.out.println("Sum of odd numbers: " + sumOfOdds);
    }
}
