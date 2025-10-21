package org.example.zusätzliches;

public class ScopeDemonstator {

  public static void demonstrate() {
    int i = 5;

    {
      int j = -5;
      System.out.println("i ist " + i);
      System.out.println("j ist " + j);
      // System.out.println("k ist " + k); funktioniert nicht, weil k erst weiter unter deklariert wird
    }

    System.out.println("i ist immer noch " + i);
    // System.out.println("j ist immer noch " + j); // j ist außerhalb des Scopes
    // System.out.println("k ist immer noch " + k); // Definition muss oberhalb erfolgen, nicht danach

    int k = 10;
  }
}
