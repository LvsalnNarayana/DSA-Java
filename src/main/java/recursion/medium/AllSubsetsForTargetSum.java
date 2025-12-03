package recursion.medium;

import java.util.ArrayList;
import java.util.List;

public class AllSubsetsForTargetSum {
    public static void method1(List<Integer> givenList, int index, int target, int sum, List<Integer> newArray) {
        if (index == givenList.size()) {
            return;
        }
        newArray.add(givenList.get(index));
        sum = sum + givenList.get(index);
        if (sum == target) {
            System.out.println(newArray);
        }
        method1(givenList, index + 1, target, sum, newArray);
        newArray.remove(newArray.size() - 1);
        sum = sum - givenList.get(index);
        method1(givenList, index + 1, target, sum, newArray);
    }

    public static void main(String[] args) {
        System.out.println("Subset Sum Output");
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> newArray = new ArrayList<>();
        method1(list1, 0, 5, 0, newArray);
    }
}
