package recursion.easy;

/* 
 * Print first N Fibonacci terms	
 * Print sequence up to N recursively.	
 * Sequential recursion
 */
public class PrintNFibonacciSeries {
    public static int fibGen(int number) {
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        int result = fibGen(number - 1) + fibGen(number - 2);
        return result;
    }

    public static void method1(int number) {
        for (int i = 0; i <= number; i++) {
            System.out.println(fibGen(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("N Fibonacci Series Output");
        PrintNFibonacciSeries.method1(8);
    }
}
