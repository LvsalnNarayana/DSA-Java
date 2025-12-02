package recursion.medium;

import java.util.List;
import java.util.ArrayList;

public class SubsetSum {
    public static void method1(List<Integer> givenList, int index, int target, int sum) {
        if (index >= givenList.size()) {
            return;
        }
        if (sum == target) {
            System.out.println(true);
            return;
        }else{
            System.out.println(false);

        }
        sum = sum + givenList.get(index);
        method1(givenList, index + 1, target, sum);
        sum = sum - givenList.get(index);
        method1(givenList, index + 1, target, sum);

    }

    public static void main(String[] args) {
        System.out.println("Subset Sum Output");
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3, 4));
        method1(list1, 0, 5, 0);
    }
}
