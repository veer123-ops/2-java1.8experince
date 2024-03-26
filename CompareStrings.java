package veer.com;

public class CompareStrings {  // Anagram string
    public static void main(String[] args) {
        String str1 = "Hello World";
        String str2 = "Hello World";

        boolean areIdentical = compareStrings(str1, str2);

        if (areIdentical) {
            System.out.println("Both strings are identical based on characters.");
        } else {
            System.out.println("Both strings are not identical based on characters.");
        }
    }

    public static boolean compareStrings(String str1, String str2) {
        // Check if the lengths are different
        if (str1.length() != str2.length()) {
            return false;
        }

        // Compare characters at each position
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false; // Found a difference, strings are not identical
            }
        }

        // No differences found, strings are identical
        return true;
    }
}
