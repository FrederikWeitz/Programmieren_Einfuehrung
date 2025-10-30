package org.example.math;

public class MathUtil {

  public static int clampInt(int x, int min, int max) {
    // Eingabe: zu überprüfender Wert, untere und obere Begrenzung
    // Ausgabe: x im Bereich der Begrenzung: wenn außerhalb, dann auf Min oder Max setzen
    // Sonderfälle:
    //      x ist kleiner als min --> x wird auf min gesetzt
    //      x ist größer als max  --> x wird auf ma gesetzt
    //      alle Werte sind gleich
    //      min und max sind vertauscht
    //            1. x liegt doch im Bereich (irgendwir), 2. x liegt außerhalb des Bereichs
    if (min > max) {
      int temp = min;
      min = max;
      max = temp;
    }
    return Math.max(min, Math.min(x, max));
  }
}
