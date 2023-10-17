package br.com.fag.domain.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.entities.Rateio;
import br.com.fag.domain.entities.Resultado;

public class MaiorValorParaApostasComCincoDezenasTest {
  private MaiorValorParaApostasComCincoDezenas sut;
  private Aposta aposta;

  @BeforeEach
  void setSut() {
    aposta = new Aposta();
    Rateio rateio = new Rateio(5, 0, 200l);
    Rateio[] arr = { rateio, rateio };
    aposta.setRateios(arr);
    Resultado.maiorValorParaApostasComCincoDezenas = 0l;
    sut = new MaiorValorParaApostasComCincoDezenas();
  }

  @Test
  void shouldIncrementVariable() {
    sut.run(aposta);

    Assertions.assertEquals(200l, Resultado.maiorValorParaApostasComCincoDezenas);
  }

  @Test
  void shouldNotIncrementVariable() {
    aposta.getRateios()[0].setValorRateio(-100l);
    sut.run(aposta);

    Assertions.assertEquals(0, Resultado.maiorValorParaApostasComCincoDezenas);
  }
}
