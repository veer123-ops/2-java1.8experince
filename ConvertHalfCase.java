package veer.com;

public class ConvertHalfCase {
    public static void main(String[] args) {
        String inputString = "HelloWorld";

        String convertedString = convertHalfCase(inputString);

        System.out.println("Original string: " + inputString);
        System.out.println("Converted string: " + convertedString);
    }

    public static String convertHalfCase(String inputString) {
        int length = inputString.length();
        int halfLength = length / 2;

        // Convert the first half to lowercase
        String firstHalfLower = inputString.substring(0, halfLength).toLowerCase();

        // Convert the second half to uppercase
        String secondHalfUpper = inputString.substring(halfLength).toUpperCase();

        // Concatenate the converted halves to form the final string
        return firstHalfLower + secondHalfUpper;
    }
}
