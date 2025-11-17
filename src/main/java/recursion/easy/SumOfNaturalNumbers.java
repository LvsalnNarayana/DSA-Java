package recursion.easy;

/* 
 * Sum of first N naturals	
 * Return sum 1 + 2 + ... + N using recursion.	
 * Return-based recursion
 */
public class SumOfNaturalNumbers {
    public static void method1(int sum, int number) {
        if (number <= 0) {
            System.out.println(sum);
            return;
        }
        method1(sum + number, number - 1);
    }

    public static int method2(int number) {
        if (number <= 0) {
            return 0;
        }
        return number + method2(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Method-1");
        SumOfNaturalNumbers.method1(0, 10);
        System.out.println("Method-2");
        System.out.println(method2(10));
    }
}
