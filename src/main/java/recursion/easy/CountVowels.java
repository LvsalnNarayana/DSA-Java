package recursion.easy;

import java.util.List;
import java.util.ArrayList;

public class CountVowels {
    static List<String> vowels = new ArrayList<String>(List.of("a", "e", "i", "o", "u"));

    public static void method1(String parentString, int count) {
        if (parentString.length() == 0) {
            System.out.println(count);
            return;
        }
        if (vowels.indexOf(parentString.substring(0, 1)) != -1) {
            method1(parentString.substring(1, parentString.length()), count + 1);
            return;
        }
        method1(parentString.substring(1, parentString.length()), count);

    }

    public static void main(String[] args) {
        System.out.println("Count Vowels Output");
        CountVowels.method1("Hello world", 0);
    }
}
