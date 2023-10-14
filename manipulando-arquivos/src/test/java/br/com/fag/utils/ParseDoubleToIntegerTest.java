package br.com.fag.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseDoubleToIntegerTest {
  
  @Test
  void shouldReturnAIntegerNumber(){
    Double price = 600.5d;
    Integer result = ParseDoubleToInteger.parse(price);

    Assertions.assertEquals(600, result);
  }

  @Test
  void shouldReturnAIntegerNumber(){
    Double price = 600.5d;
    Integer result = ParseDoubleToInteger.parse(price);

    Assertions.assertEquals(600, result);
  }
}
