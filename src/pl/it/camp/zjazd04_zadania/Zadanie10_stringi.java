package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p159772
 * Given a string, does "xyz" appear in the middle of the string?
 * To define middle, we'll say that the number of chars
 * to the left and right of the "xyz" must differ by at most one.
 * This problem is harder than it looks.
 * <p>
 * xyzMiddle("AAxyzBB") → true
 * xyzMiddle("AxyzBB") → true
 * xyzMiddle("AxyzBBB") → false
 */
public class Zadanie10_stringi {
    public static void main(String[] args) {
        System.out.println(xyzMiddle("AAxyzBB"));
        System.out.println(xyzMiddle("AxyzBB"));
        System.out.println(xyzMiddle("AxyzBBB"));
    }

    public static boolean xyzMiddle(String str) {
        if (!str.contains("xyz")) {
            return false;
        }
        String substring1 = str.substring((str.length() / 2) - 1, str.length() / 2 + 2);

        if (str.length() % 2 != 0) {
            return (substring1.equals("xyz"));
        } else {
            String substring2 = str.substring((str.length() / 2) - 2, str.length() / 2 + 1);
            return (substring1.equals("xyz")) || (substring2.equals("xyz"));
        }
    }
}
