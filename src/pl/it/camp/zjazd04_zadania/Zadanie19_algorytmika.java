package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p158767
 * Given a non-empty array,
 * return true if there is a place to split the array
 * so that the sum of the numbers on one side
 * is equal to the sum of the numbers on the other side.
 * <p>
 * canBalance([1, 1, 1, 2, 1]) → true
 * canBalance([2, 1, 1, 2, 1]) → false
 * canBalance([10, 10]) → true
 */
public class Zadanie19_algorytmika {
    public static void main(String[] args) {
        System.out.println(canBalance(new int[]{1, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{2, 1, 1, 2, 1}));
        System.out.println(canBalance(new int[]{10, 10}));
    }


    public static boolean canBalance(int[] nums) {
        int sumLeft = 0;
        int sumRight = 0;

        for (int num : nums) {
            sumRight += num;
        }

        for (int i = 0; i < nums.length; i++) {
            sumLeft += nums[i];
            sumRight -= nums[i];
            if (sumLeft == sumRight) {
                return true;
            }
        }
        return false;
    }
}
