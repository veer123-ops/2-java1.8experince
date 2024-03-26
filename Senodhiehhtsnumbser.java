package veer.com;

import java.util.Arrays;

public class Senodhiehhtsnumbser {

	

	
	    public static void main(String[] args) {
	        int[] numbers = {10, 30, 20, 50, 40}; // Example array of numbers

	        // Sort the array in descending order using streams
	        int secondHighest = Arrays.stream(numbers)
	                                  .boxed() // Convert int to Integer
	                                  .sorted((a, b) -> b - a) // Sort in descending order
	                                  .skip(1) // Skip the highest number
	                                  .findFirst() // Find the second highest number
	                                  .orElseThrow(() -> new IllegalStateException("Array is empty")); // Handle if array is empty

	        System.out.println("The second highest number is: " + secondHighest);
	    }}