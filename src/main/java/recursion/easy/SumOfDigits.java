package recursion.easy;

/* 
 * Sum of digits	
 * Return sum of all digits in integer.	
 * Return/accumulator pattern
 */
public class SumOfDigits {

    static int sum = 0;

    public static void method1(int number) {
        if (number == 0) {
            System.out.println(sum);
            return;
        }
        sum += (number % 10);
        method1(number / 10);
    }

    public static void main(String[] args) {
        System.out.println("Sum of Digits Output");
        SumOfDigits.method1(9955);
    }
}
