package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Resultado;

public class MaiorValorParaApostasComQuatroDezenas implements IAnalise {
  @Override
  public void run(Aposta aposta) {
    Long valor = aposta.getRateios()[2].getValorRateio();
    if(valor > Resultado.maiorValorParaApostasComQuatroDezenas) {
      Resultado.maiorValorParaApostasComQuatroDezenas = valor;
    }
  }
}
