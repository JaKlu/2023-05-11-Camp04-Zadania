package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p101409
 * Given a non-negative int n,
 * return the count of the occurrences of 7 as a digit,
 * so for example 717 yields 2. (no loops).
 * Note that mod (%) by 10 yields the rightmost digit (126 % 10 is 6),
 * while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
 * <p>
 * count7(717) → 2
 * count7(7) → 1
 * count7(123) → 0
 */
public class Zadanie02_rekurencja {
    public static void main(String[] args) {
        System.out.println(count7(771122557));
    }

    public static int count7(int n) {
        if (n < 1) {
            return 0;
        }
        if (n % 10 == 7) {
            return 1 + count7(n / 10);
        }
        return count7(n / 10);
    }
}
