package recursion.easy;

/* 
 * Triangular number	
 * Compute T(n) = 1 + 2 + ... + n recursively.	
 * Return-based recursion
 */
public class TriangularNumber {

    public static int method1(int number) {

        return (number * (number + 1)) / 2;

    }

    public static void main(String[] args) {
        System.out.println("LCM Using GCD Output");
        System.out.println(TriangularNumber.method1(3));
    }
}
