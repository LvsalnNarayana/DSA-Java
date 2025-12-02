package recursion.medium;

public class SumOfDigits {

    public static int method1(int number, int sum) {
        if (number == 0) {
            System.out.println(sum);
            return sum;
        }
        sum = sum + number % 10;
        return method1(number / 10, sum);

    }

    public static void main(String[] args) {
        System.out.println("Sum Of Digits Output");
        method1(2345, 0);
    }
}
