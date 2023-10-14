package br.com.fag.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseStringToLongTest {
  
  @Test
  void shouldReturnADouble() {
    String value = "65";
    Long result = ParseStringToLong.parse(value);

    Assertions.assertEquals(65l, result);
  }
}
