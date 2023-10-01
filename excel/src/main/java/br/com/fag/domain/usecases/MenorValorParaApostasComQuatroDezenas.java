package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Analisa;

public class MenorValorParaApostasComQuatroDezenas implements IAnalise {
  public void run(Aposta aposta) {
    if(aposta.getRateios()[2].getValorRateio() < Analisa.menorValorParaApostasComQuatroDezenas) {
      Analisa.menorValorParaApostasComQuatroDezenas = aposta.getRateios()[2].getValorRateio();
    }
  }
}
