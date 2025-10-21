package org.example.taschenrechner;

public class Taschenrechner implements Cloneable {

  // privates Datenfeld
  private int wert = 0;

  // warum macht man Daten privat?
  // Prinzip der Kapselung und Single Responsibility
  // macht Objekte übersichtlich, konstant und robust
  // ich muss mir nicht merken, was im Objekt genau geschieht,
  // wenn ich weiß, dass die Klasse sauber programmiert worden ist

  // =========== Konstruktoren ==============
  // Standard-Konstruktor
  public Taschenrechner() {}

  // ein besonderer Konstruktor überschreibt den Standard-Konstruktor
  // möchte ich den Standard-Konstruktor beibehalten, muss ich diesen explizit programmieren
  public Taschenrechner(int x) {
    wert = x;
  }

  // ============  Methodenfeld ==============
  // Getter und Setter
  // Getter holen einen Wert aus einem Datenfeld
  public int getWert() {
    return wert;
  }

  // Setter setzen einen Wert
  // Vorteil? man kann den Wert noch einmal auf Gültigkeit prüfen und ähnliches
  public void setWert(int neuerWert) {
    wert = neuerWert;
  }

  // Hauptmethoden
  // addiert den Parameterwert zum aktuell gespeicherten Wert
  public void add(int summand) {
    wert += summand;
  }

  // subtrahiert den Parameterwert vom aktuell gespeicherten Wert
  public void sub(int subtrahent) {
    wert -= subtrahent;
  }

  // clont das Objekt mit aktuellem Wert
  public Taschenrechner copy() {
    return new Taschenrechner(wert);
  }
  // oder: Copy-Konstruktor (üblicherweise bei den anderen Konstruktoren)
  public Taschenrechner(Taschenrechner andererTaschenrechner) {
    wert = andererTaschenrechner.getWert();
  }


  // clone ist nicht so komfortabel wie ein Copy-Konstruktor
  // und auch nicht so stabil, siehe die (überflüssige) Fehlerbehandlung
  @Override
  public Taschenrechner clone() {
    try {
      Taschenrechner clone = (Taschenrechner) super.clone();
      // TODO: copy mutable state here, so the clone can't change the internals of the original
      clone.setWert(wert);
      return clone;
    } catch (CloneNotSupportedException e) {
      throw new AssertionError();
    }
  }


  // Hilfsmethoden


}
