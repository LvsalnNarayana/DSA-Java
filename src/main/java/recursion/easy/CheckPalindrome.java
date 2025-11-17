package recursion.easy;

/* 
 * Check palindrome (simple)	
 * Check palindrome by comparing ends recursively.	
 * Two-pointer recursion on string
 */
public class CheckPalindrome {
    public static void method1(String givenString) {
        if (givenString.equals("") || givenString.length() == 1) {
            System.out.println(true);
            return;
        }

        if (givenString.substring(0, 1).equals(givenString.substring(givenString.length() - 1))) {
            method1(givenString.substring(1, givenString.length() - 1));
        } else {
            System.out.println(false);
            return;
        }

    }

    public static void main(String[] args) {
        System.out.println("Palindrome Output");
        CheckPalindrome.method1("helooeh");
    }
}
