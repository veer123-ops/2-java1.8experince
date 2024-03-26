package veer.com;

public class CheckStringRotations {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "lohel";

        boolean areRotations = checkIfRotations(str1, str2);

        if (areRotations) {
            System.out.println("The strings are rotations of each other.");
        } else {
            System.out.println("The strings are not rotations of each other.");
        }
    }

    public static boolean checkIfRotations(String str1, String str2) {
        // Check if both strings have the same length and are not empty
        if (str1.length() != str2.length() || str1.isEmpty() || str2.isEmpty()) {
            return false;
        }

        // Concatenate str1 with itself
        String concatenatedString = str1 + str1;

        // Check if str2 is a substring of the concatenated string
        return concatenatedString.contains(str2);
    }
}
