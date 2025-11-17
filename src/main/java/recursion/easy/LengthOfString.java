package recursion.easy;

public class LengthOfString {

    public static void method1(String givenString, int length) {
        if (givenString == "") {
            System.out.println(length);
            return;
        }
        method1(givenString.substring(1), length + 1);
    }

    public static int method2(String givenString, int length) {
        if (givenString == "") {
            return length;
        }
        method1(givenString.substring(1), length + 1);
        return length;
    }

    public static int method3(String givenString) {
        if (givenString.equals("")) {
            return 0;
        }
        return 1 + method3(givenString.substring(1));
    }

    public static void main(String[] args) {
        System.out.println("Length of String Output");
        LengthOfString.method2("hello world!", 0);
    }
}
