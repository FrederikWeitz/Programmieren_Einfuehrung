package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.example.arrays.ArrayDemonstrate.getMaxValue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetMaxValueTest {

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



}
