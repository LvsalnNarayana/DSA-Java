package recursion.medium;

import java.util.ArrayList;
import java.util.List;

/* 
 * Permutations of array	
 * Generate permutations for array of ints.	
 * In-place swap + backtracking
 */
public class PermutationOfArray {
    public static void swap(List<Integer> toSwapArray, int i, int j) {
        int temp;
        temp = toSwapArray.get(j);
        toSwapArray.set(j, toSwapArray.get(i));
        toSwapArray.set(i, temp);

    }

    public static void method1(List<Integer> givenArray, int index) {
        if (index == givenArray.size()) {
            System.out.println(givenArray);
            return;
        }
        for (int i = index; i < givenArray.size(); i++) {
            swap(givenArray, index, i);
            method1(givenArray, index + 1);
            swap(givenArray, i, index);
        }

    }

    public static void main(String[] args) {
        System.out.println("Permutatios of Array Output");
        PermutationOfArray.method1(new ArrayList<Integer>(List.of(1, 2, 3)), 0);
    }
}
