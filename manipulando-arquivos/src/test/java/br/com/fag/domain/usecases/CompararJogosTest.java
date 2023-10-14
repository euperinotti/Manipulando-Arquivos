package br.com.fag.domain.usecases;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.entities.Resultado;

public class CompararJogosTest {

  private Aposta aposta;
  private CompararJogos sut;

  @AfterEach
  void clear() {
    Resultado.jogoEscolhido = new ArrayList<>();
    Resultado.jogoEncontrado = "";
  }

  @BeforeEach
  void setSut() {
    aposta = new Aposta();
    sut = new CompararJogos();
  }

  @Test
  void shouldSetAFindGameIfUserInputIsCorrect() {
    ArrayList<Integer> bolasSorteadas = new ArrayList<>(Stream.of(4, 5, 30, 33, 41, 52).collect(Collectors.toList()));
    aposta.setBolasSorteadas(bolasSorteadas);
    Resultado.jogoEscolhido = Stream.of(4, 5, 30, 33, 41, 52).collect(Collectors.toList());

    sut.run(aposta);

    Assertions.assertNotNull(Resultado.jogoEncontrado);
  }

  @Test
  void shouldNotSetAFindGameIfUserInputIsIncorrect() {
    ArrayList<Integer> bolasSorteadas = new ArrayList<>(Stream.of(4, 5, 30, 33, 41, 52).collect(Collectors.toList()));
    aposta.setBolasSorteadas(bolasSorteadas);
    Resultado.jogoEscolhido = Stream.of(1, 2, 3, 4, 5, 6).collect(Collectors.toList());

    sut.run(aposta);

    Assertions.assertEquals("", Resultado.jogoEncontrado);
  }
}
