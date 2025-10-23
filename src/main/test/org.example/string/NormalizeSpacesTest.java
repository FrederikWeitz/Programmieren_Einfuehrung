package org.example.string;

import org.junit.jupiter.api.Test;

import static org.example.string.StringUtil.normalizeSpaces;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NormalizeSpacesTest {

  // Normalfall
  @Test
  void testNormalCase() {
    assertEquals("[ Test ]", normalizeSpaces(" [  Test  ] "));
  }

  // ======= Randfälle:
  // a) String ist leer
  @Test
  void testEmptyString() {
    assertEquals("", normalizeSpaces(""));
  }

  // b) String ist nur mit Leerzeichen gefüllt
  @Test
  void testOnlySpaces() {
    assertEquals("", normalizeSpaces("          "));
  }

  // c) String ist null
  @Test
  void testNullObject() {
    assertEquals("", normalizeSpaces(null));
  }
}
