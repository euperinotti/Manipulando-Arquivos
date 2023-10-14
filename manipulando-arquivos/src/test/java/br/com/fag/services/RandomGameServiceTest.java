package br.com.fag.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Resultado;

public class RandomGameServiceTest {
  private RandomGameService sut;

  @BeforeEach
  void setService() {
    sut = new RandomGameService();
  }
  
  @Test
  void shouldSetARandomGamble() {
    List<Integer> random = sut.start();

    Assertions.assertEquals(Resultado.jogoSorteado, random);
  }

  @Test
  void shouldGenerateRandomGamblesEveryCall() {
    List<Integer> random = sut.start();
    List<Integer> random2 = sut.start();

    Assertions.assertNotEquals(random2, random);
  }
}
