package veer.com;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class FindSpecialCharacters {
    public static void main(String[] args) {
        String inputString = "Hello 123 @World #$%^";

        // Define a regular expression pattern to match non-alphanumeric characters
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");

        // Using Java 8 streams and pattern matching to find special characters
        String specialCharacters = inputString.chars()
                .filter(c -> pattern.matcher(String.valueOf((char) c)).matches())
                .mapToObj(c -> String.valueOf((char) c))
                .distinct()
                .collect(Collectors.joining());

        System.out.println("Input string: " + inputString);
        System.out.println("Special characters found: " + specialCharacters);
    }
}
