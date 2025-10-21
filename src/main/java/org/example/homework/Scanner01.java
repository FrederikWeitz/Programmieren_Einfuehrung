package org.example.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scanner01 {

  public static void doMultipleScan() {
    // erste Zahl eingeben
    Scanner sc =new Scanner(System.in);
    System.out.print("Gib eine ganze Zahl ein: ");
    int a = 0;
    try {
      a = sc.nextInt();
    } catch (InputMismatchException e) {
      System.out.println(e.getMessage());
      System.out.println("NextLine-Überprüfung: " + sc.nextLine());
    }

    // zweite Zahl eingeben
    System.out.print("Gib eine Zweite ganze Zahl ein: ");
    int b=sc.nextInt();

    // Hier ist ein nextLine nötig bevor der String text eingelesen wird
    // Anmerkung: das nextLine() ist nötig, weil von der nextInt()-Eingabe
    // ein 'Enter' stehen bleibt, das zuerst eingelesen werden muss (ein Bug, seit 20 Jahren)
    sc.nextLine();

    // dritte Zahl einlesen
    System.out.print("Gib die dritte Zahl ein: ");

    String text=sc.nextLine();
    // parseInt wandelt einen String in einen Integer um
    // implizit wird dann das Integer-Objekt in einen primitiven Datentyp umgewandelt
    int c = Integer.parseInt(text);

    int summe = a+b+c;
    System.out.println("Die Summe aus "+a+" + "+b+" + "+c+" ist "+summe);
  }

}
