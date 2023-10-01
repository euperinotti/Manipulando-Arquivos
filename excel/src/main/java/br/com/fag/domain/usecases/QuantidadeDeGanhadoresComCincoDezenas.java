package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantidadeDeGanhadoresComCincoDezenas implements IAnalise {

  @Override
  public void run(Aposta aposta) {
    Analisa.quantidadeDeGanhadoresComCincoDezenas += aposta.getGanhadores5Acertos();
  }
  
}
