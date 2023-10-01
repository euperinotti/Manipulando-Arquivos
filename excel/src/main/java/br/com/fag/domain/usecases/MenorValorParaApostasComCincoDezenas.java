package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Analisa;

public class MenorValorParaApostasComCincoDezenas implements IAnalise {
  public void run(Aposta aposta) {
    if(aposta.getRateio5Acertos() < Analisa.menorValorParaApostasComQuatroDezenas) {
      Analisa.menorValorParaApostasComQuatroDezenas = aposta.getRateio5Acertos();
    }
  }
}
