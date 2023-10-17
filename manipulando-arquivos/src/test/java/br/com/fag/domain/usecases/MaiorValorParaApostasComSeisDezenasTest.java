package br.com.fag.domain.usecases;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.entities.Rateio;
import br.com.fag.domain.entities.Resultado;

public class MaiorValorParaApostasComSeisDezenasTest {
  private MaiorValorParaApostasComSeisDezenas sut;
  private Aposta aposta;

  @BeforeEach
  void setSut() {
    aposta = new Aposta();
    Rateio rateio = new Rateio(6, 0, 200l);
    Rateio[] arr = { rateio };
    aposta.setRateios(arr);
    Resultado.maiorValorParaApostasComSeisDezenas = 0l;
    sut = new MaiorValorParaApostasComSeisDezenas();
  }

  @Test
  void shouldIncrementVariable() {
    sut.run(aposta);

    Assertions.assertEquals(200l, Resultado.maiorValorParaApostasComSeisDezenas);
  }

  @Test
  void shouldNotIncrementVariable() {
    aposta.getRateios()[0].setValorRateio(-100l);
    sut.run(aposta);

    Assertions.assertEquals(0, Resultado.jogosSemGanhadorSeisAcertos);
  }
}
