package br.com.fag.domain.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.entities.Rateio;
import br.com.fag.domain.entities.Resultado;

public class JogosSemGanhadorSeisAcertosTest {

  private JogosSemGanhadorSeisAcertos sut;
  private Aposta aposta;

  @BeforeEach
  void setSut() {
    aposta = new Aposta();
    Rateio rateio = new Rateio(6, 0, 0l);
    Rateio[] arr = {rateio};
    aposta.setRateios(arr);
    Resultado.jogosSemGanhadorSeisAcertos = 0;
    sut = new JogosSemGanhadorSeisAcertos();
  }
  
  @Test
  void shouldIncrementVariable() {
    sut.run(aposta);

    Assertions.assertEquals(1, Resultado.jogosSemGanhadorSeisAcertos);
  }

  @Test
  void shouldNotIncrementVariable() {
    aposta.getRateios()[0].setQuantidadeDeGanhadores(5);
    sut.run(aposta);

    Assertions.assertEquals(0, Resultado.jogosSemGanhadorSeisAcertos);
  }

}
