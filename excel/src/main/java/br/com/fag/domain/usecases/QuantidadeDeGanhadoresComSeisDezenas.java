package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantidadeDeGanhadoresComSeisDezenas implements IAnalise {

  @Override
  public void run(Aposta aposta) {
    Resultado.quantidadeDeGanhadoresComSeisDezenas += aposta.getRateios()[0].getQuantidadeDeGanhadores();
  }
  
}
