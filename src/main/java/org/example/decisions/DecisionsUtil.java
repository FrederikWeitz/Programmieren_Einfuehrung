package org.example.decisions;

public class DecisionsUtil {

  // Liegt x im Intervall [a, b]? Wenn ja, gib wahr aus (nutze zwei Vergleiche, oder ...).
  // Parameter (2, [0, 10])
  // Parameter (2, [0]) + (2, [0, 10, 15])
  // Parameter (2, [10, 0])
  public static boolean isInInterval(double number, double[] interval) {
    // Guard-Clause:
    // wenn das Array ungleich zwei Einträge hat, dann gib false zurück
    if (interval.length != 2) { return false; }

    // Guard-Clause:
    // wenn die erste Zahl größer als die zweite ist, drehe die beiden Zahlen um
    if (interval[0] > interval[1]) {
      double temp = interval[1];
      interval[1] = interval[0];
      interval[0] = temp;
    }

    // prüfe auf im Interval
    return number >= interval[0] && number <= interval[1];
  }

}
