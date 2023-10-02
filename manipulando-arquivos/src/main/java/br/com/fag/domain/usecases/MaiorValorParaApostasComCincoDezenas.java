package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Resultado;

public class MaiorValorParaApostasComCincoDezenas implements IAnalise {
  @Override
  public void run(Aposta aposta) {
    Long valor = aposta.getRateios()[1].getValorRateio();
    if(valor > Resultado.maiorValorParaApostasComCincoDezenas) {
      Resultado.maiorValorParaApostasComCincoDezenas = valor;
    }
  }
}
