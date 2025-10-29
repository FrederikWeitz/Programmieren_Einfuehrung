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

  public static void demonstrate2DArray() {
    // Array von 3 x 8 Feldern; 3 im äußeren Array, jeweils 8 im inneren Array
    int[][] arr =
        {
            {1,  2, 3, 4, 5, 6, 7, 8},
            {9, 10,11,12,13,14,15,16},
            {17,18,19,20,21,22,23,24}
        };

    System.out.println("Alte Form der for-Schleife:");
    for(int i = 0; i < arr.length; i++) {
      for(int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + "-");
      }
      System.out.println();
    }

    System.out.println("\nNeue Form der for-Schleife:");
    for (int[] ints : arr) {
      for (int anInt : ints) {
        System.out.print(anInt + "-");
      }
      System.out.println();
    }
  }

  public static void createCheckBoard() {
    // gleichmäßiges zweidimensionales Array
    ChessFigures[][] checkBoard =
        {
            {ChessFigures.TURM,ChessFigures.SPRINGER,ChessFigures.LÄUFER,ChessFigures.KÖNIG,ChessFigures.DAME,ChessFigures.LÄUFER,ChessFigures.SPRINGER,ChessFigures.TURM},
            {ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER},
            {ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER},
            {ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER},
            {ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER},
            {ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER,ChessFigures.LEER},
            {ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER,ChessFigures.BAUER},
            {ChessFigures.TURM,ChessFigures.SPRINGER,ChessFigures.LÄUFER,ChessFigures.KÖNIG,ChessFigures.DAME,ChessFigures.LÄUFER,ChessFigures.SPRINGER,ChessFigures.TURM}
        };

    for(ChessFigures[] figureArray : checkBoard) {
      for(ChessFigures figure : figureArray) {
        System.out.print(figure.getSymbol());
      }
      System.out.println();
    }
  }

  public static void raggedArray() {
    // zweidimensionale Arrays, bei denen das innere Array unterschiedlich viele
    // Elemente besitzt, nennt man ragged (zerlumpt, zerfetzt)
    int[][] arr = new int[5][];
    arr[0] = new int[]{1, 2, 3, 4, 5, 6};
    arr[1] = new int[]{1,2,3};
    arr[2] = new int[]{1,2,3,4,5};
    arr[3] = new int[]{1,2};
    arr[4] = new int[10];


  }

}
