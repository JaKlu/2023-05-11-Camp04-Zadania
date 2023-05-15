package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p117019
 * Given 2 int values greater than 0,
 * return whichever value is nearest to 21 without going over.
 * Return 0 if they both go over.
 * <p>
 * blackjack(19, 21) → 21
 * blackjack(21, 19) → 21
 * blackjack(19, 22) → 19
 */
public class Zadanie14_logika {
    public static void main(String[] args) {
        System.out.println(blackjack(19, 21));
        System.out.println(blackjack(21, 19));
        System.out.println(blackjack(19, 22));
    }

    public static int blackjack(int a, int b) {
        if (a > 21 && b > 21) {
            return 0;
        }
        if (a > 21) {
            return b;
        }
        if (b > 21) {
            return a;
        }

        int aDiff = 21 - a;
        int bDiff = 21 - b;

        return (aDiff < bDiff ? a : b);
    }
}
