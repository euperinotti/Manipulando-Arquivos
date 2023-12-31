package br.com.fag.domain.usecases;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.utils.CompareArrays;
import br.com.fag.utils.ParseListToArray;

public class CompararJogos implements IAnalise {
  @Override
  public void run(Aposta aposta) {
    Integer[] arr = ParseListToArray.parse(aposta.getBolasSorteadas()); 
    Integer[] jogoEscolhido = ParseListToArray.parse(Resultado.jogoEscolhido);
    Integer[] jogoSorteado = ParseListToArray.parse(Resultado.jogoSorteado);

    if (CompareArrays.compare(arr, jogoSorteado)) {
      Resultado.jogoEncontrado = "Sorteio com os mesmos números:" + aposta.getConcurso() + " - " + aposta.getDataSorteio();
    }

    if (CompareArrays.compare(arr, jogoEscolhido)) {
      Resultado.jogoEncontrado = "Sorteio com os mesmos números:" + aposta.getConcurso() + " - " + aposta.getDataSorteio();
    }
  }
}
