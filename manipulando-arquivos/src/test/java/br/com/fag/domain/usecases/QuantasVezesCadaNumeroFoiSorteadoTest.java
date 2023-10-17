package br.com.fag.domain.usecases;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.entities.Resultado;

public class QuantasVezesCadaNumeroFoiSorteadoTest {
  
  private QuantasVezesCadaNumeroFoiSorteado sut;
  private Aposta aposta;

  @BeforeEach
  void setSut() {
    aposta = new Aposta();
    ArrayList<Integer> bolas = new ArrayList<>();
    bolas.add(1);
    aposta.setBolasSorteadas(bolas);
    Resultado.quantasVezesCadaNumeroFoiSorteado = new HashMap<>();
    sut = new QuantasVezesCadaNumeroFoiSorteado();
  }
  
  @Test
  void shouldIncrementVariable() {
    sut.run(aposta);

    Assertions.assertEquals(1, Resultado.quantasVezesCadaNumeroFoiSorteado.get(1));
  }

  @Test
  void shouldNotIncrementVariable() {
    sut.run(aposta);

    Assertions.assertEquals(null, Resultado.quantasVezesCadaNumeroFoiSorteado.get(2));
  }
}
