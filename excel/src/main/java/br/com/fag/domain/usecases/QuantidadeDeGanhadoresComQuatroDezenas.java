package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantidadeDeGanhadoresComQuatroDezenas implements IAnalise {

  @Override
  public void run(Aposta aposta) {
    Resultado.quantidadeDeGanhadoresComQuatroDezenas += aposta.getRateios()[2].getQuantidadeDeGanhadores();
  }
  
}
