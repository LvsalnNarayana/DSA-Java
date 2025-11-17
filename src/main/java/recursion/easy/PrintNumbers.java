package recursion.easy;

/*
* Print numbers 1 → N	
* Recursively print integers from 1 up to N.
* Index recursion (forward)
*/
public class PrintNumbers {
    public static void runAscending(int number) {
        if (number <= 0) {
            return;
        }
        runAscending(number - 1);
        System.out.println(number);
    }

    public static void runDescending(int number) {
        if (number <= 0 || number > number) {
            return;
        }
        System.out.println(number);
        runDescending(number - 1);
    }

    public static void main(String[] args) {
        System.out.println("Ascending Number Order");
        PrintNumbers.runAscending(10);
        System.out.println("Descending Number Order");
        PrintNumbers.runDescending(10);
    }
}
