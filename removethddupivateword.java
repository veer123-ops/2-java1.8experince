package veer.com;




import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class removethddupivateword {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        List<String> distinctStrings = strings.stream()
                                             .distinct()
                                             .collect(Collectors.toList());

        System.out.println("Original list: " + strings);
        System.out.println("List with duplicates removed: " + distinctStrings);
    }
}


