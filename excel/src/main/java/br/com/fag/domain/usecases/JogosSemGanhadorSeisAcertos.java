package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class JogosSemGanhadorSeisAcertos implements IAnalise {
  public void run(Aposta aposta) {
    Integer quantidadeDeGanhadores = aposta.getRateios()[0].getQuantidadeDeGanhadores();
    if (quantidadeDeGanhadores == 0 || quantidadeDeGanhadores == null) {
      Analisa.jogosSemGanhadorSeisAcertos++;
    }
  }
}
