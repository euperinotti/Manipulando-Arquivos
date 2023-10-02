package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantidadeDeGanhadoresComSeisDezenas implements IAnalise {

  @Override
  public void run(Aposta aposta) {
    Analisa.quantidadeDeGanhadoresComSeisDezenas += aposta.getRateios()[0].getQuantidadeDeGanhadores();
  }
  
}
