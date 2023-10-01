package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class JogosSemGanhadorSeisAcertos implements IAnalise {
  public void run(Aposta aposta) {
    Integer valor = 0;
    if (aposta.getGanhadores6Acertos() == 0 || aposta.getGanhadores6Acertos() == null) {
      valor++;
    }
  }
}
