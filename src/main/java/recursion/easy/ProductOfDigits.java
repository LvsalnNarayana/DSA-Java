package recursion.easy;

/* 
 * Product of digits	
 * Return product of digits in integer.	
 * Return-based recursion
 */
public class ProductOfDigits {

    static int sum = 1;

    public static void method1(int number) {
        if (number == 0) {
            System.out.println(sum);
            return;
        }
        sum *= (number % 10);
        method1(number / 10);
    }

    public static void main(String[] args) {
        System.out.println("Product of Digits Output");
        ProductOfDigits.method1(12345);
    }
}
