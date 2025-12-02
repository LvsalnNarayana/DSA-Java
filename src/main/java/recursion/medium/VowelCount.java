package recursion.medium;

import java.util.List;
import java.util.ArrayList;

public class VowelCount {
    static List<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));

    public static void method1(String givenString, int index, int count) {
        if (index >= givenString.length()) {
            System.out.println(count);
            return;
        }
        if (vowels.contains(givenString.charAt(index))) {
            count++;
        }
        method1(givenString, index + 1, count);

    }

    public static void main(String[] args) {
        System.out.println("Vowel Count Output");
        method1("hello", 0, 0);
    }
}
