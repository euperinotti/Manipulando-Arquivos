package br.com.fag.utils;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseLongToCurrencyTest {

  @Test
  void shouldReturnAStringParsedToCurrency() {
    Long value = 10000L;
    String result = ParseLongToCurrency.parse(value);

    Assertions.assertEquals("R$ 100,00", result);
  }
  
}
