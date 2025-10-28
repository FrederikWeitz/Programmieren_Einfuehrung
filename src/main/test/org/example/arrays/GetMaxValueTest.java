package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.example.arrays.ArrayDemonstrate.getMaxValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetMaxValueTest {

  /*
    Namenskonvention: Jeder Testname beschreibt genau den Randfall.
    Unabhängigkeit: Jeder Test prüft nur einen Aspekt der Logik.
    Klarheit: assertNull und assertEquals decken beide Rückgabetypen (Integer und null) ab.
    Robustheit: Extremwerte (Integer.MIN_VALUE, Integer.MAX_VALUE) sind enthalten.
  */

  @Test
  public void normalIntArray() {
    assertEquals(16, getMaxValue(new int[] {4, 9, 16, 3, 5, 14}));
  }

  //     Array ist leer (es gibt keinen größten Wert) -> Guard Clause: null als Rückgabewert
  @Test
  public void emptyIntArray() {
    assertNull(getMaxValue(new int[] {}));
  }

  //     Array ist null (weil Array ein Objekt ist, kann es null sein) -> Guard Clause: null als Rückgabewert
  @Test
  public void nullIntArray() {
    assertNull(getMaxValue(null));
  }

  // Kein Vergleich nötig
  @Test
  void testSingleElement() {
    assertEquals(42, getMaxValue(new int[]{42}));
  }

  // Max bleibt unverändert
  @Test
  void testAllEqualValues() {
    assertEquals(7, getMaxValue(new int[]{7, 7, 7, 7}));
  }

  // Max am Ende
  @Test
  void testAscendingOrder() {
    assertEquals(10, getMaxValue(new int[]{1, 3, 5, 7, 10}));
  }

  // Max am Anfang
  @Test
  void testDescendingOrder() {
    assertEquals(10, getMaxValue(new int[]{10, 7, 5, 3, 1}));
  }

  // Testet normales Verhalten
  @Test
  void testMixedPositiveAndNegativeValues() {
    assertEquals(8, getMaxValue(new int[]{-3, -1, 0, 2, 8, 5}));
  }

  // Testet negatives Verhalten
  @Test
  void testAllNegativeValues() {
    assertEquals(-1, getMaxValue(new int[]{-10, -50, -3, -1, -5}));
  }

  // Testet Extremwerte
  @Test
  void testWithMinAndMaxIntegerValues() {
    assertEquals(Integer.MAX_VALUE, getMaxValue(new int[]{Integer.MIN_VALUE, 0, Integer.MAX_VALUE}));
  }

  // Testet allgemeine Robustheit
  @Test
  void testRandomOrderWithDuplicates() {
    assertEquals(9, getMaxValue(new int[]{5, 9, 3, 9, 1, 2, 9}));
  }
}
