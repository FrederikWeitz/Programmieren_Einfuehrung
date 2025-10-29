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
    // Eingabe: beliebiges Ganzzahl-Array oder null
    // Ausgabe: sortiertes Ganzzahl-Array oder null

    // Guard Clause I: Parameter ist null -> Rückgabe ist null
    if (arr == null) return null;

    // Guard Clause II: Array ist leer oder besitzt nur ein Element -> Sortieren unnötig
    if (arr.length <= 1) return arr;

    // Solange sortieren, bis von arr.length - 1 (normaler höchster Index eines Arrays)
    // und noch mal -1, weil das letzte Element keinen Nachfolger hat
    // da bei jedem Durchlauf noch ein Element weniger geprüft werden muss, brauche ich
    // eine Reihe von length-2, bis length entspricht null, absteigend:
    // ich muss die äußere Schleife runterzählen
    for (int out = (arr.length - 2); out >= 0; out--) {

      // jedes Element von index = 0 bis index = äußere Schleifenvariable
      for (int in = 0; in <= out; in++) {
        // swap-Mechanismus
        // aktuelles und nächstes Element überprüfen
        // WENN aktuelles > nächstes, DANN tauschen
        // (aktuelles Element raus, nächstes Element nach unten, rausgenommenes Element einfügen)
        if (arr[in] > arr[in+1]) {
          int temp = arr[in];    // Wert a herausnehmen
          arr[in] = arr[in + 1]; // Wert b an Position a einschreiben
          arr[in + 1] = temp;    // Wert a an Position b einschreiben
        }
      }
    }
    return arr;
  }
}
