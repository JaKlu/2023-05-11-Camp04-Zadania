package pl.it.camp.zjazd04_zadania;

/**
 * Given two strings, a and b,
 * create a bigger string made of
 * the first char of a, the first char of b,
 * the second char of a, the second char of b,
 * and so on.
 * Any leftover chars go at the end of the result.
 * <p>
 * mixString("abc", "xyz") → "axbycz"
 * mixString("Hi", "There") → "HTihere"
 * mixString("xxxx", "There") → "xTxhxexre"
 */
public class Zadanie11_stringi {
    public static void main(String[] args) {
        System.out.println(mixString("abc", "xyz"));
        System.out.println(mixString("Hi", "There"));
        System.out.println(mixString("xxxx", "There"));
    }

    public static String mixString(String a, String b) {
        StringBuilder newString = new StringBuilder();
        if (a.length() > b.length()) {
            for (int i = 0; i <= b.length() - 1; i++) {
                newString
                        .append(a.substring(i, i + 1))
                        .append(b.substring(i, i + 1));
            }
            newString.append(a.substring(b.length()));
        } else {
            for (int i = 0; i <= a.length() - 1; i++) {
                newString
                        .append(a.substring(i, i + 1))
                        .append(b.substring(i, i + 1));
            }
            newString.append(b.substring(a.length()));
        }
        return newString.toString();
    }
}
