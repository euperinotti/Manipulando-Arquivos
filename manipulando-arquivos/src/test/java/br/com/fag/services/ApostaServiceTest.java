package br.com.fag.services;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;

public class ApostaServiceTest {
  
  @Test
  void shouldReturnAListOfGambles() {
    ApostaService sut = new ApostaService();
    List<Aposta> result = sut.start();

    Assertions.assertNotNull(result);
  }
}
