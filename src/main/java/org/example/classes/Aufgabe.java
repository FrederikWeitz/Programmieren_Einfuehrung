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


}
