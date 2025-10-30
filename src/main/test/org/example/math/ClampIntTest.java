package org.example.math;

import org.junit.jupiter.api.Test;

import static org.example.math.MathUtil.clampInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClampIntTest {

  @Test
  void testValueWithinRange() {
    assertEquals(5, clampInt(5, 1, 10),
        "Wert liegt im Bereich und sollte unverändert bleiben");
  }

  @Test
  void testValueBelowMin() {
    assertEquals(1, clampInt(0, 1, 10),
        "Wert kleiner als min → sollte auf min gesetzt werden");
  }

  @Test
  void testValueAboveMax() {
    assertEquals(10, clampInt(15, 1, 10),
        "Wert größer als max → sollte auf max gesetzt werden");
  }

  @Test
  void testAllValuesEqual() {
    assertEquals(5, clampInt(5, 5, 5),
        "Alle Werte gleich → Ergebnis sollte dieser Wert sein");
  }

  @Test
  void testSwappedMinMax_ValueWithinSwappedRange() {
    // min und max vertauscht, aber x liegt zwischen 1 und 10
    assertEquals(5, clampInt(5, 10, 1),
        "Vertauschte Grenzen, x liegt im Bereich → sollte unverändert bleiben");
  }

  @Test
  void testSwappedMinMax_ValueOutsideSwappedRange_Lower() {
    assertEquals(1, clampInt(0, 10, 1),
        "Vertauschte Grenzen, x kleiner als Bereich → sollte auf min (1) gesetzt werden");
  }

  @Test
  void testSwappedMinMax_ValueOutsideSwappedRange_Upper() {
    assertEquals(10, clampInt(15, 10, 1),
        "Vertauschte Grenzen, x größer als Bereich → sollte auf max (10) gesetzt werden");
  }

}
