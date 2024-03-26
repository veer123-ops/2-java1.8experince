package veer.com;

import java.util.stream.Collectors;

public class RemoveCharacterFromStringJava8 {
    public static void main(String[] args) {
        String inputString = "Hello World";
        char charToRemove = 'o';

        // Using Java 8 streams and collectors to remove all occurrences of the character
        String stringWithoutChar = inputString.chars()
                .filter(c -> c != charToRemove)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        System.out.println("Original string: " + inputString);
        System.out.println("String without '" + charToRemove + "': " + stringWithoutChar);
    }
}
