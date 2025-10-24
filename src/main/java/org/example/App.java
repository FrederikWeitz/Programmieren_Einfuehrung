package org.example;

import static org.example.authority.Authorization.checkAuthority;

public class App {
  public static void main(String[] args) {

    if (checkAuthority(1, 236)) {
      System.out.println("Für Zugang berechtigt!");
    } else {
      System.out.println("Berechtigung fehlt!");
    }
  }
}