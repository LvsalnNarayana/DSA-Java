package recursion.easy;

/* 
 * Max in array	
 * Find maximum element of array recursively.	
 * Divide & conquer / index recursion
 */
public class MaxInArray {
    static int max = 0;

    public static void method1(int index, int[] argArray) {
        if (index == argArray.length) {
            System.out.println(max);
            return;
        }
        if (argArray[index] > max) {
            max = argArray[index];
        }
        method1(index + 1, argArray);
    }

    public static void main(String[] args) {
        System.out.println("Max in Array Output");
        MaxInArray.method1(0, new int[] { 2, 3, 4, 5, 6, 13, 25, 3, 18, 2, 20 });
    }
}
