package org.example.taschenrechner;

public class DemoTaschenrechner {

  public static void führeAus() {
    Taschenrechner t1 = new Taschenrechner();
    Taschenrechner t2 = new Taschenrechner();
    Taschenrechner t3 = new Taschenrechner(10);

    t1.add(5);

    System.out.println("Taschenrechner 1: " + t1.getWert());
    System.out.println("Taschenrechner 2: " + t2.getWert());
    System.out.println("Taschenrechner 3: " + t3.getWert());
    System.out.println("\n");
    System.out.println("Referenz auf t1: " + t1);

    // kopieren mit copy()
    // Taschenrechner t4 = t1.copy();

    // kopieren mit Copy-Konstruktur
    Taschenrechner t4 = new Taschenrechner(t1);

    System.out.println("Referenz auf t4: " + t4);

    t4.add(5);
    System.out.println("Taschenrechner 1: " + t1.getWert());
    System.out.println("Taschenrechner 4: " + t4.getWert());

    t1.add(5);
    System.out.println("Taschenrechner 1: " + t1.getWert());
    System.out.println("Taschenrechner 4: " + t4.getWert());
  }

}
