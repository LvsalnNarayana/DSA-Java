package recursion;

/* 
 * Min in array	
 * Find minimum element recursively.	
 * Divide & conquer / index recursion
 */
public class MinInArray {
    static int min = 0;

    public static void method1(int index, int[] argArray) {
        if (index == argArray.length) {
            System.out.println(min);
            return;
        }
        if (argArray[index] < min || index == 0) {
            min = argArray[index];
        }
        method1(index + 1, argArray);
    }

    public static void main(String[] args) {
        System.out.println("Min in Array Output");
        MinInArray.method1(0, new int[] { 2, 3, 4, 5, 6, 13, 25, 1, 18, 2, 20 });
    }
}
