package pl.it.camp.zjazd04_zadania;

/**
 * Program który wylicza n-ty element ciągu geometrycznego.
 * Na wejściu program dostaje pierwszy wyraz ciągu, iloraz i numer wyrazu który ma wyliczyć.
 * Krótka teoria jak działa ciąg geometryczny: https://pl.wikipedia.org/wiki/Ciąg_geometryczny. Przykład:
 * Wejście
 * 3 2 5
 * Wynik
 * 48
 */
public class Zadanie07_rekurencja {
    public static void main(String[] args) {
        System.out.println(geometricProgression(3, 2, 5));
    }

    public static int geometricProgression(int first, int ratio, int nthElement) {
        if (nthElement <= 0) {
            return 0;
        }
        if (nthElement == 1) {
            return first;
        }
        return geometricProgression(first, ratio, nthElement - 1) * ratio;
    }
}

