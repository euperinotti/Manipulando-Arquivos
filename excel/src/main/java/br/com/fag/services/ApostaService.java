package br.com.fag.services;

import java.util.List;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.infra.FileOpener;

public class ApostaService {
  public List<Aposta> start() {
    List<Aposta> listaApostas = new FileOpener().read();
    return listaApostas;
  }
}
