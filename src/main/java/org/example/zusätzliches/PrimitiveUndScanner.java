package org.example.zusätzliches;

import java.util.Scanner;

public class PrimitiveUndScanner {

  public static void demonstration() {
    // Datenverarbeitung -> EVA = Eingabe Verarbeitung Ausgabe
    // int a -> Deklaration = Datentyp und Variablenname
    // = 6   -> Initialisierung = Zuweisungsoperator (=) und Wert
    // ist der Wert ein ausgeschriebener Wert, nennt man diesen auch Literal (wörtlich)
    int a = 6;
    char b = 'a';
    double c1 = 6.7;
    float c2 = 6.7f;
    String s = "Text";
    final String s1 = "unveränderlich";
    s += " und Bild"; // s = s + " und Bild"
    // s1 += "oder auch nicht";

    Scanner sc = new Scanner(System.in);
    System.out.print("Bitte gib eine Ganzzahl ein: ");
    int n = sc.nextInt();

    n = n * 2; // Verarbeitung

    System.out.println("Der doppelte Wert deiner Zahl lautet: " + n);

    // Fließkommazahlen in deutsch bitte mit Komma, nicht mit Punkt eingeben
    System.out.print("Bitte gib eine Fließzahl ein: ");
    double d = sc.nextDouble();
    System.out.println("Deine Zahl lautet: " + d);
  }

}
