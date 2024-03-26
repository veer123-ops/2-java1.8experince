package veer.com;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WordsStartingWithVowels {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";

        List<String> wordsStartingWithVowels = findWordsStartingWithVowels(text);

        System.out.println("Words starting with vowels:");
        wordsStartingWithVowels.forEach(System.out::println);
    }

    public static List<String> findWordsStartingWithVowels(String text) {
        return Arrays.stream(text.split("\\s+"))  // Split the text into words
                .filter(word -> word.matches("(?i)[aeiou].*"))  // Filter words starting with vowels (case-insensitive)
                .collect(Collectors.toList());
    }
}
