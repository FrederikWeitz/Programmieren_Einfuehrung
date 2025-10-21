package org.example.string;

public class StringDemonstrate {

  public static void proofAndSearch() {
    String s = " Hallo Welt!    ";
    System.out.println("Anfänglich: " + s);

    // Länge erfragen (Achtung: index = length - 1)
    int len = s.length();
    System.out.println("Länge: " + len);

    // Index auf einem String, mit charAt
    char c1 = s.charAt(3);
    char c2 = s.charAt(7);
    // char c3 = s.charAt(13); Parameter ist größer als Index
    System.out.println("Index 3 und 6: " + c1 + c2);

    // Index für Beginn eines Teilstrings
    int pos = s.indexOf("Welt");
    System.out.println("indexOf(\"Welt\"): " + pos);

    // prüft, ob ein Teilstring enthalten ist
    boolean hasHallo = s.contains("Hallo");
    System.out.println("contains: " + hasHallo);

    System.out.println("contains: " +
            ( s.contains("Hallo") ? "wahr" : "falsch" )
        );

    // beschneidet einen String am Anfang und am Ende um sämtliche Leer- und Steuerzeichen
    System.out.println(" mit Leerzeichen: " + s + "#");
    System.out.println("ohne Leerzeichen: " + s.trim() + "#");


    // prüft, ob ein String leer ist
    String s1 = "";
    String s2 = null;
    if (s2 != null && !s1.isEmpty()) {
      System.out.println("Beide Strings sind gültig");
    } else {
      System.out.println("Irgendwas stimmt nicht mit deinen Strings.");
    }
    System.out.println("isEmpty: " + s1.isEmpty());
    // wirft immer NullPointerException, weil
    // diese Methode immer auf einem Objekt ausgeführt wird
    // System.out.println("is null: " + s2.isEmpty());
  }
}
