package recursion.medium;

import java.util.HashMap;
import java.util.Map;

public class KeypadCombinations {

    // Field to hold the keypad mapping
    private static final Map<Character, String> keypad = new HashMap<>();

    // Static block → allowed place to run put() statements
    static {
        keypad.put('2', "abc");
        keypad.put('3', "def");
        keypad.put('4', "ghi");
        keypad.put('5', "jkl");
        keypad.put('6', "mno");
        keypad.put('7', "pqrs");
        keypad.put('8', "tuv");
        keypad.put('9', "wxyz");
    }

    public static void method1(String inputText, String outputCombo) {
        // later you will use keypad.get(digit) during recursion
        for (int i = 0; i < inputText.length(); i++) {
            for (int j = 2; j <= 9; j++) {
                if (keypad.get(Integer.toString(j).charAt(0)).contains(Character.toString(inputText.charAt(i)))) {
                    for (int k = 0; k <= keypad.get(Integer.toString(j).charAt(0))
                            .indexOf(Character.toString(inputText.charAt(i))); k++) {
                        outputCombo += Integer.toString(j);
                    }

                }
            }
        }
        System.out.println(outputCombo);
    }

    public static void method2(String givenCode, int index, String newCombo) {
        if (newCombo.length() == givenCode.length()) {
            System.out.println(newCombo);
            return;
        }
        String letters = keypad.get(givenCode.charAt(index));
        for (Character c : letters.toCharArray()) {
            newCombo += c;
            method2(givenCode, index + 1, newCombo);
            newCombo = newCombo.substring(0, (newCombo.length() - 1));
        }

    }

    public static void main(String[] args) {
        System.out.println("Keypad Combinations Output");
        method2("234", 0, "");
    }
}
