package org.example.string;

public class StringUtil {



  /**
   * wrapWith(Zeichenkette, Präfix, Suffix): Zeichenkette mit Präfix und Suffix
   * @param str String, der eingehüllt wird
   * @param prefix natürlich Präfix
   * @param suffix und Suffix
   * @return eingehüllter String
   */
  public static String wrapWith(String str, String prefix, String suffix) {
    // Robustheit des Codes:
    // wenn ein Wert eingegeben wird, den man nicht wünscht (weil er zum Beispiel einen
    // Fehler schmeißt), sollte man dies behandeln; das erhöht die Robustheit des Codes:
    // das Programm bricht nicht unerwartet ab oder funktioniert dann für einen Teil
    if (str == null) str = "";
    if (prefix == null) prefix = "";
    if (suffix == null) suffix = "";

    // Leerzeichen zu Beginn und am Ende des String str kürzen
    String tempStr = str.trim();

    // Präfix voranstellen (concatenate)
    tempStr = prefix + tempStr; // + heißt bei Strings: verbinden, in der sichtbaren Reihenfolge

    // Suffix hinten anhängen (concatenate)
    tempStr = tempStr + suffix;

    // Ergebnis zurückgeben
    return tempStr;
  }
}
