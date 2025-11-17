package recursion.easy;

/* 
 * Replace char in string	
 * Return new string with all occurrences replaced.	
 * String recursion (rebuild)
 */
public class ReplaceChar {
    public static void method1(String parentString, String oldChar, String newChar, String newString) {
        if (parentString.length() == 0) {
            System.out.println(newString);
            return;
        }
        if (parentString.substring(0, 1).equals(oldChar)) {
            method1(parentString.substring(1, (parentString.length())), oldChar, newChar,
                    newString + newChar);
            return;
        }
        // else{
        // }
        method1(parentString.substring(1, (parentString.length())), oldChar, newChar,
                newString + parentString.substring(0, 1));

    }

    public static void main(String[] args) {
        System.out.println("Replace Char Output");
        ReplaceChar.method1("Hello world", "e", "r", "");
    }
}
