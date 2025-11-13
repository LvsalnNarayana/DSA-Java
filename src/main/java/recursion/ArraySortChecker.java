package recursion;

/* 
* Check array sorted	
* Return true if array elements non-decreasing.	
* Index recursion (pairwise check)
 */
public class ArraySortChecker {
    public static void method1(int index, int[] argArray, boolean sorted) {
        if (index == argArray.length) {
            System.out.println("Array is Sorted: " + sorted);
            return;
        }
        if (argArray.length == 1) {
            System.out.println("Array is Sorted: " + !sorted);
            return;
        }
        if (index > 0) {
            if (index > 1 && !sorted) {
                System.out.println("Array is Sorted: " + sorted);
                return;
            }
            if (argArray[index] > argArray[index - 1]) {
                sorted = true;
            }

        }
        method1(index + 1, argArray, sorted);
    }

    public static void main(String[] args) {
        System.out.println("Array Sort Checker Output");
        ArraySortChecker.method1(0, new int[] { 2, 1, 3, 4, 5, 6 }, false);
    }
}
