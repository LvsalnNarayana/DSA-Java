package recursion.medium;

public class ConsecutiveDuplicates {

    public static void method1(String input, int index, int duplicateIndex, String newString) {

        // Base condition: when index reaches the end, print the result.
        if (index >= input.length()) {
            System.out.println(newString);
            return;
        }

        // Expand duplicateIndex to skip all consecutive duplicates
        while (duplicateIndex < input.length()
                && input.charAt(duplicateIndex) == input.charAt(index)) {
            duplicateIndex++;
        }

        // If only one occurrence, append it
        if (duplicateIndex - index == 1) {
            newString += input.charAt(index);
            method1(input, index + 1, index + 1, newString);
        } else {
            // If multiple occurrences, skip them entirely
            method1(input, duplicateIndex, duplicateIndex, newString);
        }
    }

    public static void main(String[] args) {
        System.out.println("Consecutive Duplicates Output");
        method1("azzxxxxy", 0, 0, "");
    }
}
