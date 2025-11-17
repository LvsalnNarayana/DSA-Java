package recursion.medium;

import java.util.List;
import java.util.ArrayList;

public class SubSetsOfArray {
    public static void method1(List<Integer> givenArr, int index, List<Integer> newArr) {

        if (index == givenArr.size()) {
            System.out.println(newArr);
            return;
        }
        newArr.add(givenArr.get(index));
        method1(givenArr, index + 1, newArr);
        newArr.remove(newArr.size() - 1);
        method1(givenArr, index + 1, newArr);
    }

    public static void main(String[] args) {
        System.out.println("Subsets of Array Output");
        SubSetsOfArray.method1(new ArrayList<Integer>(List.of(1, 2, 3, 4, 5)), 0, new ArrayList<Integer>());
    }
}
