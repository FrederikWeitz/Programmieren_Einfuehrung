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

  public static String getFullLengthDayName(int dayNumber) {
    // Guard-Clause für ungültige Werte
    if (dayNumber < 1 || dayNumber > 7) { return null; }

    String fullLengthName;

    // switch: wähle anhand des Wertes den passenden Fall
    switch(dayNumber) {
      case 1:
        fullLengthName = "Montag";
        break;
      case 2:
        fullLengthName = "Dienstag";
        break;
      case 3:
        fullLengthName = "Mittwoch";
        break;
      case 4:
        fullLengthName = "Donnerstag";
        break;
      case 5:
        fullLengthName = "Freitag";
        break;
      default:
        fullLengthName = "Wochenende";
    }
    return fullLengthName;
  }

  public static String getFullLengthDayNameShortened(int dayNumber) {
    // Guard-Clause für ungültige Werte
    if (dayNumber < 1 || dayNumber > 7) { return null; }

    // switch: wähle anhand des Wertes den passenden Fall
    return switch (dayNumber) {
      case 1 -> "Montag";
      case 2 -> "Dienstag";
      case 3 -> "Mittwoch";
      case 4 -> "Donnerstag";
      case 5 -> "Freitag";
      default -> "Wochenende";
    };
  }

  public static String getFullLengthDayNameWithArray(int dayNumber) {
    // Guard-Clause für ungültige Werte
    if (dayNumber < 1 || dayNumber > 7) { return null; }

    String[] fullLengthName = {"Mo", "Di", "Mi", "Do", "Fr", "Wochenende"};

    if (dayNumber < 6) {
      return fullLengthName[dayNumber-1];
    }
    return fullLengthName[5];
  }
}
