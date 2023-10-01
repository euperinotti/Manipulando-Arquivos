package br.com.fag.domain.usecases;

import java.util.HashMap;
import java.util.Map;

import br.com.fag.domain.entities.Aposta;

public class QuantasVezesCadaNumeroFoiSorteado {
  public Integer run(Aposta aposta) {
    Map<Integer, Integer> listaDeNumeros = new HashMap<>();
    Integer i = 0;
    for (i = 0; i <= 60; i++) {
      if (aposta.getBolasSorteadas().contains(i)) {
        if (listaDeNumeros.containsKey(i)) {
          listaDeNumeros.put(i, listaDeNumeros.get(i) + 1);
        } else {
          listaDeNumeros.put(i, 1);
        }
      }
    }
    return null;
  }
}
