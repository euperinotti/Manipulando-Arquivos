package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Analisa;

public class MaiorValorParaApostasComQuatroDezenas implements IAnalise {
  public void run(Aposta aposta) {
    Double valor = aposta.getRateios()[2].getValorRateio();
    if(valor > Analisa.maiorValorParaApostasComQuatroDezenas) {
      Analisa.maiorValorParaApostasComQuatroDezenas = valor;
    }
  }
}
