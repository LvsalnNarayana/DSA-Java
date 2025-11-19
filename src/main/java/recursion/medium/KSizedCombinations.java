package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class KSizedCombinations {
    public static void swap(List<Integer> toSwapArray, int i, int j) {
        int temp;
        temp = toSwapArray.get(j);
        toSwapArray.set(j, toSwapArray.get(i));
        toSwapArray.set(i, temp);

    }

    public static void method1(List<Integer> givenArray, int index, int size, List<Integer> newArray) {
        if (newArray.size() == size) {
            // System.out.println(newArray);
            method2(newArray, 0);
            return;
        }
        for (int i = index; i < givenArray.size(); i++) {
            newArray.add(givenArray.get(i));
            method1(givenArray, i + 1, size, newArray);
            newArray.remove(newArray.size() - 1);
        }
    }

    public static void method2(List<Integer> givenArray, int index) {
        if (index == givenArray.size()) {
            System.out.println(givenArray);
            return;
        }
        for (int i = index; i < givenArray.size(); i++) {
            swap(givenArray, index, i);
            method2(givenArray, i + 1);
            swap(givenArray, i, index);
        }
    }

    public static void main(String[] args) {
        System.out.println("K-Sized Combinations of Output");
        KSizedCombinations.method1(new ArrayList<Integer>(List.of(1, 2, 3, 4)), 0, 2, new ArrayList<Integer>());
    }
}
