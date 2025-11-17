package recursion.easy;

/* 
 * Reverse digits (numeric)	
 * Produce integer with digits reversed.	
 * Parameterized state / stack unwinding
 */
public class ReverseDigits {
    static String reversedDigits = "";

    public static void method1(int number) {
        if (number == 0) {
            System.out.println(Integer.parseInt(reversedDigits));
            return;
        }
        // reversedDigits += Integer.toString(number % 10);
        reversedDigits = reversedDigits.concat(Integer.toString(number % 10));
        method1(number / 10);
    }

    public static void main(String[] args) {
        System.out.println("Reversed Digits Output");
        ReverseDigits.method1(1234);
    }
}
