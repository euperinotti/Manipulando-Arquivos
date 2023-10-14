package br.com.fag.services;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Resultado;

public class UserServiceTest {

  private UserService sut;

  @BeforeEach
  void setService() {
    sut = new UserService();
  }

  @Test
  void shouldSetAUserGamble() {
    Integer[] numeros = { 1, 2, 3, 4, 5, 6 };
    sut.setGamble(Arrays.asList(numeros));

    Assertions.assertEquals(Resultado.jogoEscolhido, Arrays.asList(numeros));
  }
}
