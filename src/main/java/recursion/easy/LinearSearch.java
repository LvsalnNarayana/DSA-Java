package recursion.easy;

/* 
 * Linear search (recursive)	
 * Return index of target or −1 recursively.	
 * Index recursion
 */
public class LinearSearch {
    public static void method1(int index, int[] argArray, int searchTerm) {
        if (argArray.length == 1 && argArray[index] == searchTerm) {
            System.out.println("Element found at index: " + index);
            return;
        }
        if (index == argArray.length) {
            System.out.println("Element not found: -1");
            return;
        }
        if (argArray[index] == searchTerm) {
            System.out.println("Element found at index: " + index);
            return;
        }
        method1(index + 1, argArray, searchTerm);
    }

    public static void main(String[] args) {
        System.out.println("Linear Search Output");
        LinearSearch.method1(0, new int[] { 2, 1, 3, 4, 5, 6 }, 6);
    }
}
