package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Resultado;

public class MaiorValorParaApostasComSeisDezenas implements IAnalise {
  @Override
  public void run(Aposta aposta) {
    Double valor = aposta.getRateios()[0].getValorRateio();
    if(valor > Resultado.maiorValorParaApostasComSeisDezenas) {
      Resultado.maiorValorParaApostasComSeisDezenas = valor;
    }
  }
}
