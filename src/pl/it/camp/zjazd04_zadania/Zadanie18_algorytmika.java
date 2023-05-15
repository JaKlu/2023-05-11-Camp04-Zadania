package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p193817
 * Say that a "clump" in an array is a series of 2 or more
 * adjacent elements of the same value.
 * Return the number of clumps in the given array.
 * <p>
 * countClumps([1, 2, 2, 3, 4, 4]) → 2
 * countClumps([1, 1, 2, 1, 1]) → 2
 * countClumps([1, 1, 1, 1, 1]) → 1
 */
public class Zadanie18_algorytmika {
    public static void main(String[] args) {
        System.out.println(countClumps(new int[]{1, 2, 2, 3, 4, 4}));
        System.out.println(countClumps(new int[]{1, 1, 2, 1, 1}));
        System.out.println(countClumps(new int[]{1, 1, 1, 1, 1}));
    }

    public static int countClumps(int[] nums) {
        boolean isClump = false;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                i = j;
                if (nums[j] == nums[j + 1]) {
                    isClump = true;
                } else {
                    break;
                }
            }
            if (isClump) {
                sum += 1;
                isClump = false;
            }
        }
        return sum;
    }
}
