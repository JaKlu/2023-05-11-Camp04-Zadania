package pl.it.camp.zjazd04_zadania;

/**
 * https://codingbat.com/prob/p197890
 * Given a string, return the sum of the digits 0-9 that appear in the string,
 * ignoring all other characters.
 * Return 0 if there are no digits in the string.
 * (Note: Character.isDigit(char) tests if a char
 * is one of the chars '0', '1', .. '9'.
 * Integer.parseInt(string) converts a string to an int.)
 * <p>
 * sumDigits("aa1bc2d3") → 6
 * sumDigits("aa11b33") → 8
 * sumDigits("Chocolate") → 0
 */
public class Zadanie15_algorytmika {
    public static void main(String[] args) {
        System.out.println(sumDigits("aa1bc2d3"));
        System.out.println(sumDigits("aa11b33"));
        System.out.println(sumDigits("Chocolate"));
    }

    public static int sumDigits(String str) {
        int sum = 0;
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (Character.isDigit(array[i])) {
                sum += Integer.parseInt(String.valueOf(array[i]));
            }
        }
        return sum;
    }
}
