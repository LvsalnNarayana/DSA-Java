package recursion.easy;

/* 
 * GCD (Euclidean)	
 * Compute greatest common divisor via gcd(a,b)=gcd(b,a%b).	
 * Tail recursion / mathematical recursion
 */
public class GCDEucledian {

    public static int method1(int number1, int number2) {
        if (number1 > number2) {
            if (number2 == 0) {
                return number1;
            }
            return method1(number2, number1 % number2);
        }
        if (number1 == 0) {
            return number2;
        }
        return method1(number1, number2 % number1);

    }

    public static void main(String[] args) {
        System.out.println("GCD Using Eucledian Output");
        System.out.println(GCDEucledian.method1(31, 2));
    }
}
