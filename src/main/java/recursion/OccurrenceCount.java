package recursion;

/* 
 * Count occurrences in array	
 * Count occurrences of value in array recursively.	
 * Index recursion with accumulator
 */
public class OccurrenceCount {

    public static void method1(int count, int index, int repeatedNumber, int[] argArray) {
        if (argArray.length == 0 || index == argArray.length) {
            System.out.println(repeatedNumber + "repeated " + count + " times");
            return;
        }
        if (argArray[index] == repeatedNumber) {
            count += 1;
        }
        method1(count, index + 1, repeatedNumber, argArray);
    }

    public static void main(String[] args) {
        System.out.println("Repeated Number in Array Output");
        OccurrenceCount.method1(0, 0, 2, new int[] { 2, 3, 4, 5, 2, 13, 25, 2, 18, 2, 20 });
    }
}
