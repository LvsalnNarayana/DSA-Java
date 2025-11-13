package recursion;

import java.math.BigInteger;

/* 
 * Factorial (n!)	
 * Compute factorial of n recursively.	
 * Return-based recursion
 */
public class Factorial {
    public static BigInteger method1(int number) {
        if (number <= 1) {
            return BigInteger.valueOf(1);
        }
        BigInteger given = BigInteger.valueOf(number);
        return given.multiply(method1(number - 1));
    }

    public static void main(String[] args) {
        System.out.println("Factotial Output");
        System.out.println(Factorial.method1(20));
    }
}
