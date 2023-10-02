package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.domain.entities.Resultado;

public class MenorValorParaApostasComQuatroDezenas implements IAnalise {
  @Override
  public void run(Aposta aposta) {
    Double valor = aposta.getRateios()[2].getValorRateio();
    if(valor < Resultado.menorValorParaApostasComQuatroDezenas) {
      Resultado.menorValorParaApostasComQuatroDezenas = valor;
    }
  }
}
