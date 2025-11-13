package recursion;

import java.util.*;

/* 
 * Binary representation (list of bits)	
 * Return list/array of bits for n.	
 * Return & merge (divide)
 */
public class DecimalToBinaryList {

    static ArrayList<Integer> binaryList = new ArrayList<Integer>();

    public static void method1(int number) {
        if (number == 1) {
            System.out.println(1);
        }
        int quotient = number / 2;
        int reminder = number % 2;
        if (quotient == 1) {
            binaryList.add(0, reminder);
            binaryList.add(0, quotient);
            System.out.println(binaryList.toString());
            return;
        }
        binaryList.add(0, reminder);
        method1(quotient);
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Binary List Output");
        DecimalToBinaryList.method1(21);
    }
}
