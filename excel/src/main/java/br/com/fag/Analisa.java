package br.com.fag;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Analisa {

  public void quantidadeDeVezesCadaNumeroFoiSorteado(List<Aposta> apostas) {
    Map<Integer, Integer> listaDeNumeros = new HashMap<>();
    Integer i = 0;

    for (Aposta aposta : apostas) {
      for (i = 0; i <= 60; i++) {
        if (aposta.getBolasSorteadas().contains(i)) {
          if (listaDeNumeros.containsKey(i)) {
            listaDeNumeros.put(i, listaDeNumeros.get(i) + 1);
          } else {
            listaDeNumeros.put(i, 1);
          }
        }
      }
    }

    System.out.println(listaDeNumeros);
  }
}
