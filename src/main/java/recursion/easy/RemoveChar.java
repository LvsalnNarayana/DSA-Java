package recursion.easy;

/* 
 * Remove char from string	
 * Return string with a character removed.	
 * Filter recursion
 */
public class RemoveChar {
    public static void method1(String parentString, String oldChar, String newString) {
        if (parentString.length() == 0) {
            System.out.println(newString);
            return;
        }
        if (parentString.substring(0, 1).equals(oldChar)) {
            method1(parentString.substring(1, (parentString.length())), oldChar,
                    newString);
            return;
        }
        method1(parentString.substring(1, (parentString.length())), oldChar,
                newString + parentString.substring(0, 1));

    }

    public static void main(String[] args) {
        System.out.println("Remove Char Output");
        RemoveChar.method1("Hello world", "e", "");
    }
}
