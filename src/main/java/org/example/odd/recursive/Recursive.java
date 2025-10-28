package org.example.odd.recursive;

public class Recursive {

  static boolean gestartet = false;

  public static void main(String[] args) {
    if (!gestartet) {
      gestartet = true;
      main(null); // Rekursiver Aufruf, aber nur einmal? Oder doch nicht?
    } else {
      gestartet = false;
      main(null); // Und wieder zurück – ein Ping-Pong der Verzweiflung
    }
  }

  static {
    gestartet = !gestartet; // Noch bevor main startet, wird alles verdreht
    if (gestartet) {
      main(null); // Startet sich selbst, bevor es gestartet wurde
      main(null);
    }
  }
}
