package recursion.medium;

public class CountPalindromicSubstrings {
    public static int method1(String inputString, int right, int left) {
        if (left < 0 || right >= inputString.length()) {
            return 0;
        }
        if (inputString.charAt(right) == inputString.charAt(left)) {
            return 1 + method1(inputString, right + 1, left - 1);

        } else {
            return 0;
        }
    }

    public static void method2(String inputString) {
        int count = 0;
        for (int i = 0; i < inputString.length(); i++) {
            count += method1(inputString, i, i);
            count += method1(inputString, i, i - 1);
        }
        System.out.println(count);

    }

    public static void main(String[] args) {
        System.out.println("Palindromic Substrings Output");
        method2("aaaa");
    }
}
