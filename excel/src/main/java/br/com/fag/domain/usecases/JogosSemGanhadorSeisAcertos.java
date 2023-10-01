package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Aposta;

public class JogosSemGanhadorSeisAcertos {
  public Integer run(Aposta aposta) {
    Integer valor = 0;
    if (aposta.getGanhadores6Acertos() == 0 || aposta.getGanhadores6Acertos() == null) {
      valor++;
    }
    return valor;
  }
}
