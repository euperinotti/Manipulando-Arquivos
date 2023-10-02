package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantasVezesCadaNumeroFoiSorteado implements IAnalise {
  public void run(Aposta aposta) {
    Integer i = 0;
    for (i = 0; i <= 60; i++) {
      if (aposta.getBolasSorteadas().contains(i)) {
        if (Analisa.listaDeNumeros.containsKey(i)) {
          Analisa.listaDeNumeros.put(i, Analisa.listaDeNumeros.get(i) + 1);
        } else {
          Analisa.listaDeNumeros.put(i, 1);
        }
      }
    }
  }
}
