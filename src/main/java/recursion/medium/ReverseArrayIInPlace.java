package recursion.medium;

import java.util.List;
import java.util.ArrayList;

public class ReverseArrayIInPlace {
    public static void swap(List<Integer> toSwapArray, int i, int j) {
        int temp;
        temp = toSwapArray.get(j);
        toSwapArray.set(j, toSwapArray.get(i));
        toSwapArray.set(i, temp);
    }

    public static void method1(List<Integer> givenArray) {
        int leftIndex = 0;
        int rightIndex = givenArray.size() - 1;
        method2(givenArray, leftIndex, rightIndex);

    }

    public static void method2(List<Integer> givenArray, int leftIndex, int rightIndex) {
        if (leftIndex > rightIndex) {
            System.out.println(givenArray);
            return;
        }
        swap(givenArray, leftIndex, rightIndex);
        method2(givenArray, leftIndex + 1, rightIndex - 1);
    }

    public static void main(String[] args) {
        System.out.println("In Place Reverse Array Output");
        List<Integer> newList = new ArrayList<Integer>(List.of(1, 2, 3, 4, 5));
        method1(newList);
    }
}
