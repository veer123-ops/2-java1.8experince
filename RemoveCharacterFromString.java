package veer.com;
public class RemoveCharacterFromString {
    public static void main(String[] args) {
        String inputString = "Hello World";
        char charToRemove = 'o';

        // Using replace method to remove all occurrences of the character
        String stringWithoutChar = inputString.replace(String.valueOf(charToRemove), "");

        System.out.println("Original string: " + inputString);
        System.out.println("String without '" + charToRemove + "': " + stringWithoutChar);
    }
}
