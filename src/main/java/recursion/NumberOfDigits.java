package recursion;

/* 
 * Count digits	
 * Count number of digits in positive integer.	
 * Numeric recursion (divide by 10)
 */
public class NumberOfDigits {
    static int count = 0;

    public static void method1(int number) {
        if (number == 0) {
            System.out.println(count);
            return;
        }
        count += 1;
        method1(number / 10);

    }

    public static void main(String[] args) {
        System.out.println("Number of digits Output");
        NumberOfDigits.method1(2000000000);
    }

}
