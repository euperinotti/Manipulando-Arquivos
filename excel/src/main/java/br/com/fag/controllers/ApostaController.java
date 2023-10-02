package br.com.fag.controllers;

import java.util.List;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class ApostaController {
  private List<IAnalise> dependencias;
  private List<Aposta> apostas;

  public ApostaController(List<Aposta> apostas, List<IAnalise> dependencias) {
    this.dependencias = dependencias;
    this.apostas = apostas;
  }

  public void handle() {
    for (Aposta aposta : this.getApostas()) {
      this.getDependencias().forEach(lib -> {
        lib.run(aposta);
      });
    }
  }

  public List<IAnalise> getDependencias() {
    return this.dependencias;
  }

  public List<Aposta> getApostas() {
    return this.apostas;
  }

}
