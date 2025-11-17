package recursion.easy;

/* 
 * Sum of array elements	
 * Return sum of all array elements recursively.	
 * Index recursion with accumulation
 */
public class SumOfArray {

    public static void method1(int[] givenArray, int sum, int index) {
        if (index == givenArray.length) {
            System.out.println(sum);
            return;
        }
        method1(givenArray, sum + givenArray[index], index + 1);

    }

    public static void main(String[] args) {
        System.out.println("Sum of Array Output");
        SumOfArray.method1(new int[] { 10, 20, 30 }, 0, 0);
    }
}
