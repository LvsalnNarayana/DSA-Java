package recursion.medium;

/* 
 * Generate all binary strings 
 * length N	Produce all 2ⁿ binary strings.	
 * Build-as-you-go (partial state)
 */
public class BinaryStrings {
    public static void method1(int number, int index, String outputString) {
        if (index == number) {
            System.out.println(outputString);
            return;
        }
        String newOutputString = outputString + "0";
        method1(number, index + 1, newOutputString);
        newOutputString = outputString + "1";
        method1(number, index + 1, newOutputString);

    }

    public static void main(String[] args) {
        System.out.println("Binary Strings Output");
        BinaryStrings.method1(4, 0, "");
    }
}
