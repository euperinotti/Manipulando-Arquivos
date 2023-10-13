package br.com.fag.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompareArraysTest {
  
  @Test
  void shouldReturnTrueIfArraysAreEquals() {
    Integer[] arrA = {0, 0, 0, 0, 0, 0};
    Integer[] arrB = {0, 0, 0, 0, 0, 0};

    boolean result = CompareArrays.compare(arrA, arrB);
    Assertions.assertEquals(true, result);
  }

  @Test
  void shouldReturnFalseIfArraysAreDifferent() {
    Integer[] arrA = {1, 1, 1, 1, 1, 1};
    Integer[] arrB = {0, 0, 0, 0, 0, 0};

    boolean result = CompareArrays.compare(arrA, arrB);
    Assertions.assertEquals(false, result);
  }
}
