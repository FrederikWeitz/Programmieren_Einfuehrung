package org.example.arrays;

public class ArrayDemonstrate {

  // Implementiere eine Funktion, die den Maximalwert eines int[] berechnet.
  // Übergeben wird ein beliebiges Array (nicht leer). Rückgabe ist der größte Wert.
  public static Integer getMaxValue(int[] intArr) {
    // Eingabe: ein Array beliebiger Größe mit Ganzzahlen
    // Ausgabe: die größte Ganzzahl
    // Invariante: größte Zahl bis zum bis dahin durchlaufenen Index
    // Grenzfälle:
    //     Array ist null (weil Array ein Objekt ist, kann es null sein) -> Guard Clause: null als Rückgabewert
    //     Array ist leer (es gibt keinen größten Wert) -> Guard Clause: null als Rückgabewert
    //  zur Erläuterung: null dient als Signal, dass die Funktion kein ordentlich Ergebnis liefern konnte

    // Guard Clauses
    if (intArr == null || intArr.length == 0) return null;

    // Definition von einer maxZahl (= Invariante)
    int maxZahl = intArr[0];

    // Schleifendurchlauf durch das gesamte Array, Index wird nicht benötigt,
    // deshalb 'moderne' For-Schleife
    for (int i : intArr) {
      maxZahl = Math.max(i, maxZahl);
    }
    return maxZahl;
  }

  public static int[] sortWithBubble(int[] arr) {

    return new int[]{};
  }

}
