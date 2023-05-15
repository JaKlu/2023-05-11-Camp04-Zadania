package pl.it.camp.zjazd04_zadania;

/**
 * Program który wylicza n-ty element ciągu arytmetycznego.
 * Na wejściu program dostaje pierwszy wyraz ciągu, różnicę i numer wyrazu który ma wyliczyć.
 * Krótka teoria jak działa ciąg arytmetyczny: https://pl.wikipedia.org/wiki/Ciąg_arytmetyczny.
 * Przykład działania programu:
 * Wejście
 * 2 5 4
 * Wynik
 * 17
 */
public class Zadanie06_rekurencja {
    public static void main(String[] args) {
        System.out.println(arithmeticProgression(2, 5, 4));
    }

    public static int arithmeticProgression(int first, int difference, int nthElement) {
        if (nthElement <= 0) {
            return 0;
        }
        if (nthElement == 1) {
            return first;
        }
        return arithmeticProgression(first, difference, nthElement - 1) + difference;
    }
}
