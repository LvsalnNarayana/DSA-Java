package recursion.easy;

/* 
 * Decimal → binary (string)	
 * Convert integer to binary string via recursion.	
 * Divide recursion (base conversion)
 */
public class DecimalToBinary {
    static String binaryString = "";

    public static void method1(int number) {
        if (number == 1) {
            System.out.println(1);
        }
        int quotient = number / 2;
        int reminder = number % 2;
        if (quotient == 1) {
            binaryString = binaryString + reminder + quotient;
            System.out.println(new StringBuilder().append(binaryString).reverse().toString());
            return;
        }
        binaryString += Integer.toString(reminder);
        method1(quotient);
    }

    public static void main(String[] args) {
        System.out.println("Decimal to Binary Output");
        DecimalToBinary.method1(21);
    }
}
