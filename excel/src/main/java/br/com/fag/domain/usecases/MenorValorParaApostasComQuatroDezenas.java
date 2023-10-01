package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Analisa;

public class MenorValorParaApostasComQuatroDezenas implements IAnalise {
  public void run(Aposta aposta) {
    if(aposta.getRateio4Acertos() < Analisa.menorValorParaApostasComQuatroDezenas) {
      Analisa.menorValorParaApostasComQuatroDezenas = aposta.getRateio4Acertos();
    }
  }
}
