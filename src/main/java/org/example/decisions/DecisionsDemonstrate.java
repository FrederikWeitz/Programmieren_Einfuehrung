package org.example.decisions;

public class DecisionsDemonstrate {

  public static void calculateIfSlipperyConditions(int temperature) {
    // Wenn temperature < 0 dann
    if (temperature < 0) {
      System.out.println("Glättegefahr");
    }

    // ein einfaches If wird immer dann verwendet, wenn ein zusätzlicher Code
    // in den normalen Algorithmus eingebaut werden soll

    // Achtung! keine Ausgabe, wenn Bedingung nicht erfüllt
    // immer fragen: was erwarte ich in diesem Fall?
  }

  public static void testIfPersonIsAdult(int age) {
    // Wenn age >= 18 dann
    if (age >= 18) {
      // Zutritt erlauben
      System.out.println("Zutritt erlauben");

      // sonst
    } else {
      // Zutritt verweigern
      System.out.println("Zutritt verweigern");
    }

    // if ... else bei Entweder-Oder-Entscheidungen
  }

  // Zusatz
  public static void testIfPersonIsAdultTernary(int age) {
    System.out.println("Zutritt " + ((age >= 18) ? "erlauben" : "verweigern"));
  }

  // if ... else if ... else
  public static void writeExaminationGrade(int points) {
    // Note muss zwischen 0 und 100 liegen
    // deshalb zuerst ein Guard Clause
    if (points < 0 || points > 100) {
      System.out.println("Das ist keine korrekte Punktzahl!");
      return;
    }

    // Wenn points >= 90 dann
    if (points >= 90) {
      System.out.println("Note 1");

      // sonst wenn points >= 75 dann
    } else if (points >= 75) {
      System.out.println("Note 2");

      // sonst wenn points >= 60 dann
    } else if (points >= 60) {
      System.out.println("Note 3");

      // sonst
    } else {
      System.out.println("Note 4");
    }
  }


}
