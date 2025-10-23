package org.example.string;

import java.util.Arrays;

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

  public static void changeAndReplace() {
    String t = " Rot Gelb Blau ";

    // schneidet Leer- und Formatierungszeichen am Rang ab
    String trimmed = t.trim();
    System.out.println("ungetrimmt: " + t);
    System.out.println("  getrimmt: " + trimmed);

    System.out.println();

    // verändert alle Kleinbuchstaben zu Großbuchstaben
    String upper = trimmed.toUpperCase();
    System.out.println("in Großbuchstaben: " + upper);

    // verändert alle Großbuchstaben zu Kleinbuchstaben & ersetzt Leerzeichen durch Bindestrich
    String kebab = trimmed.toLowerCase().replace(" ", "-");
    //                         return ---->
    // Ausgabe: "rot-gelb-blau"
    System.out.println("in Kebab-Case: " + kebab);

    // ersetzt alle L durch = und alle B durch !
    String unlesbar =
        trimmed.replace("l", "=")      // gibt String zurück
               .replace("b", "!")      // gibt String zurück
               .replace("B", "(@)")
               .replace("au", "#");
    // Ausgabe: "Rot Ge=! B=au"
    System.out.println("unlesbar: " + unlesbar);
    System.out.println();

    // Vorsicht bei Methodenverkettungen: der Rückgabewert kann sich im Datentyp ändern
    // Beispiel für eine Umwandlung Integer -> String
    Integer a = 10115;
    String chained = a.toString().replace("1", "!");
    System.out.println("chained: " + chained);
    // Ausgabe: "!0!!5"

    trimmed = "rot \n\n\tgrün              blau";
    // ersetzt mehrfach Leer- und Steuerzeichen mit Hilfe von einer regional Expression (regex)
    String clean = trimmed.replaceAll("\\s+", " ");
    System.out.println("unbereinigt: " + trimmed);
    System.out.println("bereinigter String: " + clean);
    System.out.println();

    // schneidet Teilstring heraus [n, m[
    String teil = clean.substring(4, 8);
    System.out.println("Teil von drei Farben: " + teil);

    // teilt entlang eines Strings (regex!), gibt Array zurück
    String[] farben = clean.split(" ");
    // Ausgabe: ["rot", "grün", "blau"]
    System.out.println("Array von Farben: " + Arrays.toString(farben));
    // das Array wieder zusammensetzen mit String.join(...)
    // Ausgabe: "rot,grün,blau"
    System.out.println("Join mit Komma: " + String.join(",", farben));
    System.out.println("mit fixem Array: " + String.join("--", new String[]{"Berg", "Tal", "Wald"}));

    // format für Zeichenketten
    String formatiert = "-- '%10s' -- %d";
    System.out.printf(formatiert, "Land", 10);
    System.out.println();
    String fmt = String.format(formatiert,"Fluss", 5);
    System.out.println(fmt);
    String fmt2 = String.format(formatiert,"Flussbiegungsangler", 5);
    System.out.println(fmt2);
  }
}
