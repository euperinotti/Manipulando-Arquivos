package br.com.fag.infra;

import java.util.List;

import br.com.fag.interfaces.IService;

public class ServicesHandle {
  private List<IService> servicos;

  public ServicesHandle(List<IService> dependencias) {
    this.servicos = dependencias;
  }

  public void run() {
    servicos.forEach(servico -> {
      servico.start();
    });
  }
}
