package org.example.loops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoopDemonstrate {

  public static void classicForDemo() {

    // klassische For-Schleife
    // drei Komponenten (auch Schleifenkopf):
    // Deklaration der Schleifenvariable --> int i = 0,
    // Weiterlauf-Bedingung              --> i < 10,
    // Änderung der Schleifenvariable    --> i++
    // i++ ist der Klassiker, nämlich das einfache Hochzählen, aber es sind auch andere Arten möglich
    for (int i = 0; i < 10; i++) {
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(i);
    }
  }

  public static void cutString() {
    String str = "Hallo Montag!";

    for (int i = 0; i < str.length(); i++) {
      if (i != 0) {
        System.out.print(" ");
      }
      System.out.print(str.charAt(i));
    }
  }

  public static void whileDemo() {

    // ich muss z. B. eine Schleifenvariable vorher definieren
    // immer prüfen, ob die Schleifenvariable oder Abbruch-Bedingung im while
    // sich überhaupt ändert --> wenn nicht: Gefahr einer Endlos-Schleife
    int i = 1;

    // while hat keine eigene Schleifenvariable
    // Schleife wird abgebrochen, wenn die Bedingung im Schleifenkopf
    // false wird
    while (i % 17 != 0) {
      System.out.println("Schleife: " + i);
      i++;
    }
  }

  public static void doWhileDemo() {

    int i = 0;

    do {
      System.out.println("Do-Schleife: " + i);
      i++;
    } while (i % 17 != 0);
  }

  public static void modernForLoopWithArray() {
    int[] arr = { 3, 8, 0, 14, 4};

    // in dieser For-Schleife gibt es keine Schleifenvariable,
    // dafür aber ein Schleifenelement; dies wird aus der Liste
    // geholt, die hinter dem Doppelpunkt steht
    for (int i : arr) {
      System.out.println("Element: " + i);
    }
  }

  public static void modernForLoopWithArrayList() {
    List<Integer> arr = new ArrayList<>();
    arr.add(3);
    arr.addAll(Arrays.asList(8, 4, 17, 2));

    // in dieser For-Schleife gibt es keine Schleifenvariable,
    // dafür aber ein Schleifenelement; dies wird aus der Liste
    // geholt, die hinter dem Doppelpunkt steht
    for (int i : arr) {
      System.out.println("Element: " + i);
    }
  }

  public static void forEachWithArrayList() {
    List<Integer> arr = new ArrayList<>();
    arr.add(3);
    arr.addAll(Arrays.asList(8, 4, 17, 2));

    // läuft über jedes Element aus einer ArrayList, bzw.
    // aus jedem Objekt, das das Interface List implementiert
    // im forEach steht eine Lambda-Funktion oder ein definierter Consumer
    arr.forEach(x -> System.out.println("Element: " + x));
  }

  // Zählen: Zähle die Vokale in einem String (a,e,i,o,u), gib die Anzahl aus.
  public static int getVowels(String str) {
    // Eingabe (aus Parameter)
    // erwartete Ausgabe: "Hallo Welt!" -> 3

    // Randbedingungen:
    // leerer String und null (Guard-Clause)
    // String ohne Vokale
    // String nur aus Vokalen (mind. 3 für Anfang, Mitte, Ende)

    // Guard-Clause für str = null && str = ""
    if (str == null || str.isEmpty()) return 0;

    // Zähler definieren und auf 0 setzen
    int zähler = 0;

    // for-Schleife über gesamten String (ohne Ausnahme)
    for (int i = 0; i < str.length(); i++) {
      char c = str.charAt(i);
      // WENN Zeichen von Index = 'a', 'e', 'i', 'o', 'u', DANN
      if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
        //    zähle Zähler um eins nach oben
        zähler++;
      }
    }
    // gib Ergebnis = Zähler zurück
    return zähler;
  }

  // Baue aus einem String[] einen kebab-case-String (nur Kleinbuchstaben, Bindestriche).
  public static String getKebabCase(String[] strArr) {
    // Eingabe String-Array
    StringBuilder str = new StringBuilder(); // String für die Ausgabe

    // Normalfall
    // Randfall: leerer Array
    // null statt Array
    // nur ein einzelnes Element
    // viele kurze Elemente

    // Guard-Clause für Array = null
    if (strArr == null) return null;

    // SOLANGE elemente im ARRAY (for-Schleife)
    for (int i = 0; i < strArr.length; i++) {
      // für aktuelles Element zum Ausgabe-String hinzu
      str.append(strArr[i].toLowerCase());

      // füge einen Bindestrich dazu außer nach dem letzten Element
      if (i < (strArr.length - 1)) str.append("-");
    }

    // Ausgabe String
    return str.toString();
  }

}
