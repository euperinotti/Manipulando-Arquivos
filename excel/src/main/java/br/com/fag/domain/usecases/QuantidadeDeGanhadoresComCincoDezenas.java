package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantidadeDeGanhadoresComCincoDezenas implements IAnalise {

  @Override
  public void run(Aposta aposta) {
    Resultado.quantidadeDeGanhadoresComCincoDezenas += aposta.getRateios()[1].getQuantidadeDeGanhadores();
  }
  
}
