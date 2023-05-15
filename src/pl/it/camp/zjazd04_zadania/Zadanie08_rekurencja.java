package pl.it.camp.zjazd04_zadania;

/**
 * DLA CHĘTNYCH - trochę trudniejsze zadanie.
 * Na wejściu program dostaje dowolny string który składa się tylko z liter a, b i c np. aaabbcbcbcbabab.
 * Program ma zrobić redukcję tego stringa.
 * Jak działa redukcja: ab i ba zamieniane jest na c, ac i ca zamieniane jest na b, bc i cb zamieniane jest na a.
 * Program ma redukować stringa maksymalnie jak się da.
 * Przykład: ababcbcbacab -> ccaabc -> cbcc -> acc -> bc -> a.
 * Program wyświetla a.
 * Możecie też sprawdzić co się stanie w takich sytuacjach:
 * najpierw będziecie zamieniać pary ab i ba później ac i ca i na końcu bc i cb
 * najpierw bc i cb, później ac i ca i na końcu ab i ba
 * dowolna inna kombinacja kolejności.
 */
public class Zadanie08_rekurencja {
    public static void main(String[] args) {
        String str = "ababcbcbacab";

        System.out.println(str);
        System.out.println(reduceString(str));

        System.out.println("-".repeat(20));
        System.out.println(str);
        reduceStringB(str);
    }

    public static String reduceString(String str) {
        if (str.length() == 1) {
            return str;
        }

        str = str.replaceAll("ab", "c");
        str = str.replaceAll("ba", "c");

        str = str.replaceAll("ac", "b");
        str = str.replaceAll("ca", "b");

        str = str.replaceAll("bc", "a");
        str = str.replaceAll("cb", "a");

        return reduceString(str);
    }

    public static String reduceStringB(String str) {
        if (str.length() == 1) {
            return str;
        }
        // if-y sluza tylko do wyswietlania kolejnych krokow
        if (str.contains("ab") || str.contains("ba")) {
            str = str.replaceAll("ab", "c");
            str = str.replaceAll("ba", "c");
            System.out.println(str);
        } else if (str.contains("ac") || str.contains("ca")) {
            str = str.replaceAll("ac", "b");
            str = str.replaceAll("ca", "b");
            System.out.println(str);
        } else if (str.contains("bc") || str.contains("cb")) {
            str = str.replaceAll("bc", "a");
            str = str.replaceAll("cb", "a");
            System.out.println(str);
        }
        return reduceStringB(str);
    }
}
