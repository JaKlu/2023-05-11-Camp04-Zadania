package pl.it.camp.zjazd04_zadania;

/**
 * Zamiana liczb dziesiętnych na binarne.
 * Na tej stronie na początku macie pokazane jak zamienia się liczby dziesiętne na binarne:
 * https://informatyk.edu.pl/systemy-liczbowe-system-binarny/.
 * Napiszcie program który działa rekurencyjnie i wyświetla liczbę w systemie binarnym.
 */
public class Zadanie05_rekurencja {
    public static void main(String[] args) {
        long number = 524_000L;

        // to get correct output for return type String
        //      -> max input is maximum value of argument type - in this case: long
        System.out.println(decimalToBinaryWithString(Long.MAX_VALUE));

        // to get correct output for return type long
        //      -> max input number is ~524_000L
        System.out.println(decimalToBinaryWithLong(number));
    }

    public static String decimalToBinaryWithString(long number) {
        if (number < 1) {
            return "";
        }
        if (number % 2 == 0) {
            return decimalToBinaryWithString(number / 2) + "0";
        }
        return decimalToBinaryWithString(number / 2) + "1";
    }

    public static long decimalToBinaryWithLong(long number) {
        if (number < 1) {
            return 0;
        }
        if (number == 1) {
            return 1;
        }
        if (number % 2 == 0) {
            return 10 * decimalToBinaryWithLong(number / 2);
        }
        return 10 * decimalToBinaryWithLong(number / 2) + 1;
    }
}
