package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.utils.CompareArrays;

public class CompararJogos implements IAnalise {
  public void run(Aposta aposta) {
    Integer[] arr = new Integer[aposta.getBolasSorteadas().size()];
    arr = aposta.getBolasSorteadas().toArray(arr);

    if (CompareArrays.compare(arr, (Integer[]) Analisa.jogoSorteado.toArray())) {
      System.out.println("Sorteio com os mesmos números:" + aposta.getConcurso() + " - " + aposta.getDataSorteio());
    }

    if (CompareArrays.compare(arr, (Integer[]) Analisa.jogoEscolhido.toArray())) {
      System.out.println("Sorteio com os mesmos números:" + aposta.getConcurso() + " - " + aposta.getDataSorteio());
    }
  }
}
