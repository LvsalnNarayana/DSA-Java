package recursion.medium;

/* 
 * Generate subsets of string	
 * Return all subsets (power set) of a string.	
 * Include/Exclude recursion (return & merge)
 */
public class SubSetsOfString {
    public static void method1(String givenString, int index, String newString) {
        if (givenString == "") {
            return;
        }
        if (index == givenString.length()) {
            System.out.println(newString);
            return;
        }
        String updatedNewString = newString.concat(String.valueOf(givenString.charAt(index)));
        method1(givenString, index + 1, updatedNewString);

        method1(givenString, index + 1, newString);
    }

    public static void main(String[] args) {
        System.out.println("Subsets of String Output");
        SubSetsOfString.method1("hello", 0, "");
    }
}
