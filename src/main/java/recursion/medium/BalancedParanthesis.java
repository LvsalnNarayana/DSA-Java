package recursion.medium;

/* 
 * Balanced parentheses (generate)	
 * Generate all valid parentheses strings for n pairs.	
 * Backtracking with constraint (open/close counts)
 */
public class BalancedParanthesis {
    public static void method1(int number) {
        if (number == 0) {
            return ;
        }

    }

    public static void main(String[] args) {
        System.out.println("Balanced Paranthesis Output");
        BalancedParanthesis.method1(10);
    }
}
