package org.example.string;

import org.junit.jupiter.api.Test;

import static org.example.string.StringUtil.wrapWith;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WrapWithTest {
  @Test
  void testNormalCase() {
    assertEquals("[Test]", wrapWith("Test", "[", "]"));
  }

  @Test
  void testTrimmedInput() {
    assertEquals("(abc)", wrapWith("  abc  ", "(", ")"));
  }

  @Test
  void testEmptyPrefixSuffix() {
    assertEquals("abc", wrapWith("abc", "", ""));
  }

  @Test
  void testOnlyPrefix() {
    assertEquals("<abc", wrapWith("abc", "<", ""));
  }

  @Test
  void testOnlySuffix() {
    assertEquals("abc>", wrapWith("abc", "", ">"));
  }

  @Test
  void testWhitespaceString() {
    assertEquals("[]", wrapWith("   ", "[", "]"));
  }

  @Test
  void testEmptyString() {
    assertEquals("()", wrapWith("", "(", ")"));
  }

  @Test
  void testNullString() {
    assertEquals("{}", wrapWith(null, "{", "}"));
  }

  @Test
  void testNullPrefix() {
    assertEquals("abc!", wrapWith("abc", null, "!"));
  }

  @Test
  void testNullSuffix() {
    assertEquals("[abc", wrapWith("abc", "[", null));
  }

  @Test
  void testAllNull() {
    assertEquals("", wrapWith(null, null, null));
  }

  @Test
  void testLongerPrefixSuffix() {
    assertEquals("<<<abc>>>", wrapWith("abc", "<<<", ">>>"));
  }
}
