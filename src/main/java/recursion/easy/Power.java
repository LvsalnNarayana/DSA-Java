package recursion.easy;

import java.math.BigInteger;

/* 
 * Power xⁿ (naïve)	
 * Compute x raised to n by repeated multiplication.	
 * Return-based recursion
 */
public class Power {
    public static BigInteger method1(int number, int power) {
        if (number <= 0) {
            throw new IllegalArgumentException("number can not be less than or equal to 0");
        }
        if (power < 0) {
            throw new IllegalArgumentException("power can not be less than 0");
        }
        if (power == 0) {
            return BigInteger.valueOf(1);
        }
        BigInteger given = BigInteger.valueOf(number);
        return given.multiply(method1(number, power - 1));
    }

    public static void main(String[] args) {
        System.out.println("Power Output");
        System.out.println(Power.method1(-20, 10));
    }
}
