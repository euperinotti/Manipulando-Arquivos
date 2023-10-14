package br.com.fag.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilterStringTest {
  
  @Test
  void shouldReturnAStringWithOnlyNumbers(){
    String price = "R$ 6.000,00";
    String result = FilterString.sanitize(price);

    Assertions.assertEquals("600000", result);
  }
}
