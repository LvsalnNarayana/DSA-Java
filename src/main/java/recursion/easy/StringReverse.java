package recursion.easy;

public class StringReverse {
    static String reversedString = "";
    static int index;

    public static void method1(String givenString) {
        if (givenString == "") {
            System.out.println(reversedString);
            return;
        }
        reversedString += givenString.substring(givenString.length() - 1, givenString.length());
        method1(givenString.substring(0, givenString.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println("String Reverse Output");
        StringReverse.method1("hello");
    }
}
