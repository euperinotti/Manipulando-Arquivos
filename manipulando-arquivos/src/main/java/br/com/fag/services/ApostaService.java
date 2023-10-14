package br.com.fag.services;

import java.util.List;

import br.com.fag.controllers.ApostaController;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.infra.FileOpener;
import br.com.fag.interfaces.IService;

public class ApostaService implements IService {
  public List<Aposta> start() {
    List<Aposta> listaApostas = new FileOpener().read();
    ApostaController apostaController = new ApostaController(listaApostas);
    apostaController.prepare().handle();
    return listaApostas;
  }
}
