package org.example.loops;

import org.junit.jupiter.api.Test;

import static org.example.loops.LoopDemonstrate.getKebabCase;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class GetKebabCaseTest {

  @Test
  void normalStringArray() {
    assertEquals("ich-du-er", getKebabCase(new String[]{"IcH", "dU", "ER"}));
  }

  // Randfall: leerer Array
  @Test
  void emptyStringArray() {
    assertEquals("", getKebabCase(new String[]{}));
  }

  // null statt Array
  @Test
  void nullArray() {
    assertNull(getKebabCase(null));
  }

  // nur ein einzelnes Element
  @Test
  void singleStringArray() {
    assertEquals("ich", getKebabCase(new String[]{"IcH"}));
  }

  // viele kurze Elemente
  @Test
  void multipleStringArray() {
    assertEquals("ich-du-er-a-f-f-enbrotbaum", getKebabCase(new String[]{"IcH", "dU", "ER", "a", "F", "f", "enBROTbaum"}));
  }

}
