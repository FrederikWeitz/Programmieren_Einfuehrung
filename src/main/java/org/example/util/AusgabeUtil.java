package org.example.util;

import java.util.ArrayList;
import java.util.List;

public class AusgabeUtil {

    //    FUNKTION summe(liste)
    public int summe(List<Integer> liste) {
        //    WENN liste ist leer DANN GIB ZURÜCK 0
        if (liste == null || liste.isEmpty()) {
            return 0;
        }

        //    s = 0
        int s = 0;
        //    FÜR JEDES x IN liste DANN
        for (int x : liste) {
            //            s = s + x
            s += x;
        }
        //    GIB ZURÜCK s
        return s;
        //    ENDE
    }

    public Integer minimum(Integer[] liste) {
        // Guard Clause: Abfragen, ob es sich lohnt, den Algorithmus weiter auszuführen
        if (liste == null || liste.length == 0) {
            return null;
        }

        int min = liste[0];
        // Schleife über den Array
        for(int i = 0; i < liste.length; i++) {
            if (liste[i] == null) {
                return null;
            }
            int x = liste[i];
            if (x < min) {
                min = x;
            }
        }
        return min;
    }

    public Integer minimum(int[] liste) {
        System.out.println("In der Methode mit einem int-Array");
        List<Integer> integerListe = new ArrayList<>();
        for (int i : liste) {
           integerListe.add(i);
        }

        return minimum(integerListe.toArray(Integer[]::new));
    }






}
