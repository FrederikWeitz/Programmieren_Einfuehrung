package org.example.arrays;

import org.junit.jupiter.api.Test;

import static org.example.arrays.ArrayDemonstrate.sortWithBubble;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SortWithBubbleTest {

  @Test
  void testNullArray() {
    assertNull(sortWithBubble(null));
  }

  @Test
  void testEmptyArray() {
    int[] input = {};
    int[] expected = {};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testSingleElement() {
    int[] input = {5};
    int[] expected = {5};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testAlreadySorted() {
    int[] input = {1, 2, 3, 4, 5};
    int[] expected = {1, 2, 3, 4, 5};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testReverseSorted() {
    int[] input = {5, 4, 3, 2, 1};
    int[] expected = {1, 2, 3, 4, 5};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testRandomOrder() {
    int[] input = {3, 1, 4, 2};
    int[] expected = {1, 2, 3, 4};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testWithDuplicates() {
    int[] input = {4, 2, 2, 3, 1};
    int[] expected = {1, 2, 2, 3, 4};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testWithNegativeNumbers() {
    int[] input = {3, -1, 0, -5, 2};
    int[] expected = {-5, -1, 0, 2, 3};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testAllSameValues() {
    int[] input = {7, 7, 7};
    int[] expected = {7, 7, 7};
    assertArrayEquals(expected, sortWithBubble(input));
  }

  @Test
  void testWithIntegerExtremes() {
    int[] input = {Integer.MAX_VALUE, 0, Integer.MIN_VALUE};
    int[] expected = {Integer.MIN_VALUE, 0, Integer.MAX_VALUE};
    assertArrayEquals(expected, sortWithBubble(input));
  }
}
