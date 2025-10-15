package org.example.util;

import java.util.Arrays;
import java.util.List;

public class AusgabeTest {

    public static void summeTest() {
        AusgabeUtil ausgabe = new AusgabeUtil();

        List<Integer> zahlen = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Summe: " + ausgabe.summe(zahlen)); // Ausgabe: 15
    }

    public static void minimumTest() {
        AusgabeUtil ausgabe = new AusgabeUtil();
        // int[] liste = {2, 5, 9}; // 1. Testfall -> min = 2 // nach Änderung auf liste[0] erfolgreich
        // int[] liste = {9, 3, 2, 5, 12}; // 2. Testfall -> min = 2 // nimmt nicht aus Versehen immer das erste Element als Minimum
        // int[] liste = {}; // 3. Testfall -> min existiert nicht
        // int[] liste = {-2, 5, -9}; // 4. Testfall -> min = -9
        // Integer[] liste = {2, 5, -1}; // 5. Testfall -> min = -1 // unterscheidet sich nicht von unserem Fehlerfall, sollte es aber
        Integer[] liste = {2, null};

        Integer minimum = ausgabe.minimum(liste);
        if (minimum != null) {
            System.out.println("Minimum ist: " + minimum);
        } else {
            System.out.println("Die Liste ist leer oder enthält ungültige Elemente (z. B. null). Es gibt also kein Minimum.");
        }
    }

}
