package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p183394
 * Given a string, compute recursively a new string
 * where all the adjacent chars are now separated by a "*".
 * <p>
 * allStar("hello") → "h*e*l*l*o"
 * allStar("abc") → "a*b*c"
 * allStar("ab") → "a*b"
 */
public class Zadanie04_rekurencja {
    public static void main(String[] args) {
        System.out.println(allStar("qwertyuiop"));
    }

    public static String allStar(String str) {
        if (str.length() < 2) {
            return str;
        }
        return allStar(str.substring(0, (str.length() - 1))) + "*" + str.substring(str.length() - 1);
    }
}
