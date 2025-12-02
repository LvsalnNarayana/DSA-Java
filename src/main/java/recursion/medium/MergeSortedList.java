package recursion.medium;

import java.util.List;
import java.util.ArrayList;

public class MergeSortedList {
    public static void method1(List<Integer> list1, List<Integer> list2, int leftPointer, int rightPointer,
            List<Integer> result) {

        if (rightPointer >= list2.size() && leftPointer >= list1.size()) {
            System.out.println(result);
            return;
        }
        if (leftPointer >= list1.size() && rightPointer < list2.size()) {
            result.addAll(list2.subList(rightPointer, list2.size()));
            System.out.println(result);
            return;
        }
        if (rightPointer >= list2.size() && leftPointer < list1.size()) {
            result.addAll(list1.subList(leftPointer, list1.size()));
            System.out.println(result);
            return;
        }
        if (list1.get(leftPointer) >= list2.get(rightPointer)) {
            result.add(list2.get(rightPointer));
            rightPointer++;
        } else {
            result.add(list1.get(leftPointer));
            leftPointer++;
        }
        method1(list1, list2, leftPointer, rightPointer, result);
    }

    public static void main(String[] args) {
        System.out.println("Merge Sorted List Output");
        List<Integer> list1 = new ArrayList<>(List.of(2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(List.of(5, 6, 7));
        List<Integer> result = new ArrayList<>();
        method1(list1, list2, 0, 0, result);
    }
}
