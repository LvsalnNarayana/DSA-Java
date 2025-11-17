package recursion.easy;

/* 
 * Nth Fibonacci (naïve)	
 * Compute F(n) with F(n)=F(n−1)+F(n−2).	
 * Tree recursion (inefficient)
 */
public class NthFibonacci {

    public static int method1(int number) {
        // System.out.println(number);
        if (number <= 0) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        return method1(number - 2) + method1(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Nth Fibonacci Output");
        int result = NthFibonacci.method1(6);
        System.out.println(result);
    }
}
