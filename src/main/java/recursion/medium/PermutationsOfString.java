package recursion.medium;

import java.util.List;
import java.util.ArrayList;

/* 
 * Permutations of string	
 * Generate all permutations of distinct characters.	
 * Backtracking (swap or used-array)
 */
public class PermutationsOfString {
    public static void method1(String givenString, List<Boolean> usedFlag, String outputString) {

        if (outputString.length() == givenString.length()) {
            System.out.println(outputString);
            return;
        }
        char[] givenChars = givenString.toCharArray();

        for (int i = 0; i < givenChars.length; i++) {
            if (!(usedFlag.get(i) == true)) {
                usedFlag.set(i, true);
                outputString += givenChars[i];
                method1(givenString, usedFlag, outputString);
                usedFlag.set(i, false);
                outputString = outputString.substring(0, (outputString.length() - 1));
            }

        }

    }

    public static void main(String[] args) {
        System.out.println("Binary Strings Output");
        String questionString = "hello";
        int questionStringLen = questionString.length();
        List<Boolean> questionFlags = new ArrayList<Boolean>();
        for (int i = 0; i < questionStringLen; i++) {
            questionFlags.add(false);
        }
        PermutationsOfString.method1(questionString, questionFlags, "");
    }
}
