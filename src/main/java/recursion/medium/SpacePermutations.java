package recursion.medium;

public class SpacePermutations {
    public static void method1(String givenString, int index, String newString) {
        String initialString = givenString;
        int givenIndex = index;
        String updatedNewString = String.valueOf(givenString.charAt(0));
        method2(initialString, givenIndex, updatedNewString);
    }

    public static void method2(String givenString, int index, String newString) {
        if (index == givenString.length() - 1) {
            System.out.println(newString + ", Length: " + newString.length());
            return;
        }
        String updatedString1 = newString + " " + givenString.charAt(index + 1);
        method2(givenString, index + 1, updatedString1);
        String updatedString2 = newString + givenString.charAt(index + 1);
        method2(givenString, index + 1, updatedString2);
    }

    public static void main(String[] args) {
        System.out.println("Space Permutations Output");
        SpacePermutations.method1("hello", 0, "");
    }
}
