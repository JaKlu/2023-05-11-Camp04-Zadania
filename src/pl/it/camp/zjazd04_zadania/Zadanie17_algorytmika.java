package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p191363
 * We want to make a package of goal kilos of chocolate.
 * We have small bars (1 kilo each) and big bars (5 kilos each).
 * Return the number of small bars to use,
 * assuming we always use big bars before small bars.
 * Return -1 if it can't be done.
 * <p>
 * makeChocolate(4, 1, 9) → 4
 * makeChocolate(4, 1, 10) → -1
 * makeChocolate(4, 1, 7) → 2
 */
public class Zadanie17_algorytmika {
    public static void main(String[] args) {
        System.out.println(makeChocolate(4, 1, 9));
        System.out.println(makeChocolate(4, 1, 10));
        System.out.println(makeChocolate(4, 1, 7));
    }

    public static int makeChocolate(int small, int big, int goal) {
        if (5 * big + small < goal) {
            return -1;
        }
        if (goal % 5 <= small) {
            if (goal / 5 > big) {
                return goal - 5 * big;
            }
            return goal % 5;
        }
        return -1;
    }
}
