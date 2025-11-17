package recursion.easy;

/* 
 * LCM using GCD	
 * Compute LCM using recursive GCD helper.	
 * Composition of recursive functions
 */
public class LCMNumber {

    public static int GCD(int number1, int number2) {
        if (number1 > number2) {
            if (number2 == 0) {
                return number1;
            }
            return GCD(number2, number1 % number2);
        }
        if (number1 == 0) {
            return number2;
        }
        return GCD(number1, number2 % number1);

    }

    public static int method1(int number1, int number2) {

        return (number1 * number2) / GCD(number1, number2 % number1);

    }

    public static void main(String[] args) {
        System.out.println("LCM Using GCD Output");
        System.out.println(LCMNumber.method1(80, 30));
    }
}
