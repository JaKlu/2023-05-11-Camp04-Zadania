package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p170371
 * Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.
 * <p>
 * countX("xxhixx") → 4
 * countX("xhixhix") → 3
 * countX("hi") → 0
 */
public class Zadanie03_rekurencja {
    public static void main(String[] args) {
        System.out.println(countX("kubaxx"));
    }

    public static int countX(String str) {
        if (str.length() < 1) {
            return 0;
        }
        if (str.charAt(str.length() - 1) == 'x') {
            return 1 + countX(str.substring(0, str.length() - 1));
        }
        return countX(str.substring(0, str.length() - 1));
    }
}
