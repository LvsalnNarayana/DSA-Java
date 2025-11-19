package recursion.medium;

public class StringSubSequences {
    public static void method1(String givenString, int index, String newString) {
        if (index == givenString.length()) {
            System.out.println(newString);
            return;
        }
        String updatedString = newString + givenString.charAt(index);
        method1(givenString, index + 1, updatedString);
        // newString.substring(0, newString.length() - 1);
        method1(givenString, index + 1, newString);
    }

    public static void main(String[] args) {
        System.out.println("String Subsequences Output");
        StringSubSequences.method1("hello", 0, "");
    }
}
