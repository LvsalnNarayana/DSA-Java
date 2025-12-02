package recursion.medium;

import java.util.List;
import java.util.ArrayList;

public class BalancedParanthesis {

    public static List<String> method1(int number) {
        System.out.println("[CALL] method1(" + number + ")");

        if (number == 0) {
            System.out.println("[BASE] number = 0 → return [\"\"]");
            return new ArrayList<>(List.of(""));
        }

        List<String> result = new ArrayList<>();
        System.out.println("[INIT] number = " + number + " → starting decomposition");

        for (int leftPairs = 0; leftPairs < number; leftPairs++) {
            int rightPairs = number - leftPairs - 1;
            System.out.println("\n[DECOMP] number=" + number +
                " → left=" + leftPairs + ", right=" + rightPairs);

            System.out.println("[RECURSE-LEFT] method1(" + leftPairs + ")");
            List<String> leftStructures = method1(leftPairs);

            System.out.println("[RECURSE-RIGHT] method1(" + rightPairs + ")");
            List<String> rightStructures = method1(rightPairs);

            System.out.println("[COMBINE] Combining " + 
                leftStructures.size() + " left structures and " +
                rightStructures.size() + " right structures for number=" + number);

            for (String left : leftStructures) {
                for (String right : rightStructures) {
                    String combined = "(" + left + ")" + right;
                    System.out.println("   [GEN] (" + left + ") + " + right + " → " + combined);
                    result.add(combined);
                }
            }
        }

        System.out.println("[RETURN] method1(" + number + ") → " + result);
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Balanced Parenthesis Output");
        System.out.println(method1(6));
    }
}
