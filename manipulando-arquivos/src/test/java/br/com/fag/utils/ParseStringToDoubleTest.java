package br.com.fag.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseStringToDoubleTest {
  
  @Test
  void shouldReturnADouble() {
    String value = "65";
    Double result = ParseStringToDouble.parse(value);

    Assertions.assertEquals(65d, result);
  }
}
