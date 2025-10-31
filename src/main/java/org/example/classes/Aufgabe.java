package org.example.classes;

// Importiere Zeit- und Listentypen
import java.time.LocalDateTime;
// Importiere Dauer für Berechnungen
import java.time.Duration;
// Importiere Listenschnittstelle und Implementierung
import java.util.List;
// Importiere ArrayList
import java.util.ArrayList;

public class Aufgabe {
  // Felder: Grunddaten und Beteiligte
  private String name;
  // Beschreibung der Aufgabe
  private String beschreibung;
  // Startzeitpunkt
  private LocalDateTime start;
  // Endzeitpunkt
  private LocalDateTime ende;

  // Liste der Mitarbeitenden
  private List<Mitarbeiter> mitarbeiter;
  // Verantwortliche Person
  private Verantwortlicher verantwortlicher;
  // Fortschrittslog
  private List<Fortschrittseintrag> log;

  // no args-Konstruktor
  public Aufgabe() {
    name = "";
    beschreibung = "";
    start = LocalDateTime.now();
    ende = null;
    mitarbeiter = new ArrayList<>();
    verantwortlicher = null;
    log = new ArrayList<>();
  }

  // all args-Konstruktor
  // verwendet wérden nur die Datenfelder, um die Klasse für sich zu beschreiben
  // assoziierte Klassen werden dabei nicht berücksichtigt
  public Aufgabe(String name, String beschreibung, LocalDateTime start, LocalDateTime ende) {
    this.name = name;
    this.beschreibung = beschreibung;
    this.start = start;
    this.ende = ende;
    mitarbeiter = new ArrayList<>();
    verantwortlicher = null;
    log = new ArrayList<>();
  }

  // Copy-Konstruktor
  // der Parameter ist IMMER eine Instanz derselben Klasse
  public Aufgabe(Aufgabe other) {
    // Kopiere einfache Felder
    this.name = other.name;
    this.beschreibung = other.beschreibung;
    this.start = other.start;
    this.ende = other.ende;
    // Erzeuge neue Listen
    this.mitarbeiter = new ArrayList<>();
    this.log = new ArrayList<>();
    // Übernehme Referenz auf Verantwortlichen (optional tief kopieren)
    this.verantwortlicher = other.verantwortlicher;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getStart() {
    return start;
  }

  public void setStart() {
    this.start = LocalDateTime.now();
  }

  public LocalDateTime getEnde() {
    return ende;
  }

  public void setEnde() {
    this.ende = LocalDateTime.now();
  }

  // Dauer in Minuten berechnen
  public long getDauerMinuten() {
    // Nutze Duration zwischen Start und Ende
    if (ende != null) return Duration.between(start, ende).toMinutes();
    return -1;
  }

  // Fortschrittseintrag hinzufügen
  public void addFortschritt(Fortschrittseintrag e) {
    // Hänge an die Logliste an
    log.add(e);
    // Informiere Mitarbeitende über Fortschritt
    notifyMitarbeiterFortschritt(e.getProzent());
    // Informiere Verantwortlichen kurz
    notifyVerantwortlicher("Fortschritt aktualisiert");
  }

  // Mitarbeitende über Start informieren
  public void notifyMitarbeiterStart() {
    // Über alle Mitarbeitenden iterieren
    for (Mitarbeiter m : mitarbeiter) {
    // Einzelnen Mitarbeiter informieren
      m.informStart(start);
    }
  }
  // Mitarbeitende über Ende informieren
  public void notifyMitarbeiterEnde() {
    // Über alle Mitarbeitenden iterieren
    for (Mitarbeiter m : mitarbeiter) {
      // Einzelnen Mitarbeiter informieren
      m.informEnde(ende);
    }
  }

  // Mitarbeitende über Fortschritt informieren
  public void notifyMitarbeiterFortschritt(double prozent) {
    // Schleife über alle Mitarbeitenden
    for (Mitarbeiter m : mitarbeiter) {
    // Einzelnen Mitarbeiter informieren
      m.informFortschritt(prozent);
    }
  }
  private void notifyVerantwortlicher(String fortschrittAktualisiert) {
  }
}
