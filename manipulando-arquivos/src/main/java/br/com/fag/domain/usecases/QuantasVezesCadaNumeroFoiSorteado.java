package br.com.fag.domain.usecases;

import java.util.Map;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;

public class QuantasVezesCadaNumeroFoiSorteado implements IAnalise {
  @Override
  public void run(Aposta aposta) {
    Integer i = 0;
    Map<Integer, Integer> map = Resultado.quantasVezesCadaNumeroFoiSorteado;
    for (i = 0; i <= 60; i++) {
      if (aposta.getBolasSorteadas().contains(i)) {
        if (map.containsKey(i)) {
          map.put(i, map.get(i) + 1);
        } else {
          map.put(i, 1);
        }
      }
    }
  }
}
