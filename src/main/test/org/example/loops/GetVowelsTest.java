package org.example.loops;

import org.junit.jupiter.api.Test;

import static org.example.loops.LoopDemonstrate.getVowels;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetVowelsTest {

  @Test
  void normalString() {
    assertEquals(3, getVowels("Hallo Welt!"));
  }

  // leerer String
  @Test
  void emptyString() {
    assertEquals(0, getVowels(""));
  }

  // und null (Guard-Clause)
  @Test
  void nullString() {
    assertEquals(0, getVowels(null));
  }

  // String ohne Vokale
  @Test
  void stringWithoutVowels() {
    assertEquals(0, getVowels("nlltpwq"));
  }

  // String nur aus Vokalen (mind. 3 für Anfang, Mitte, Ende)
  @Test
  void stringOnlyWithVowels() {
    assertEquals(5, getVowels("aeiou"));
  }
}
