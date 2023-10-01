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

    System.out.println("Quantidade de vezes que um número foi sorteado: " + listaDeNumeros.toString());
  }

  public void nenhumGanhadorSeisAcertos(List<Aposta> apostas) {
    Integer valor = 0;
    for (Aposta aposta : apostas) {
      if(aposta.getGanhadores6Acertos() == 0 || aposta.getGanhadores6Acertos() == null) {
        valor++;
      }
    }

    System.out.println("Quantidade de concursos sem ganhador de 6 dezenas: " + valor);
  }

  public void menorValorParaApostasComQuatroDezenas(List<Aposta> apostas) {
    Double valor = 1000000000d;
    for (Aposta aposta : apostas) {
      if(aposta.getRateio4Acertos() < valor) {
        valor = aposta.getRateio4Acertos();
      }
    }

    System.out.println("Menor valor para apostas com 4 dezenas: " + valor);
  }

  public void menorValorParaApostasComCincoDezenas(List<Aposta> apostas) {
    Double valor = 1000000000d;
    for (Aposta aposta : apostas) {
      if(aposta.getRateio5Acertos() < valor) {
        valor = aposta.getRateio5Acertos();
      }
    }

    System.out.println("Menor valor para apostas com 5 dezenas: " + valor);
  }

  public void menorValorParaApostasComSeisDezenas(List<Aposta> apostas) {
    Double valor = 1000000000d;
    for (Aposta aposta : apostas) {
      if(aposta.getRateio6Acertos() < valor) {
        valor = aposta.getRateio6Acertos();
      }
    }

    System.out.println("Menor valor para apostas com 6 dezenas: " + valor);
  }

  public void quantidadeDeGanhadoresQuatroDezenas(List<Aposta> apostas) {
    Integer qntd = 0;
    for (Aposta aposta : apostas) {
      qntd += aposta.getGanhadores4Acertos();
    }

    System.out.println("Quantidade de ganhadores com 4 dezenas: " + qntd);
  }

  public void quantidadeDeGanhadoresCincoDezenas(List<Aposta> apostas) {
    Integer qntd = 0;
    for (Aposta aposta : apostas) {
      qntd += aposta.getGanhadores5Acertos();
    }

    System.out.println("Quantidade de ganhadores com 5 dezenas: " + qntd);
  }

  public void quantidadeDeGanhadoresSeisDezenas(List<Aposta> apostas) {
    Integer qntd = 0;
    for (Aposta aposta : apostas) {
      qntd += aposta.getGanhadores6Acertos();
    }

    System.out.println("Quantidade de ganhadores com 6 dezenas: " + qntd);
  }

  public void procuraJogo(List<Aposta> apostas, Integer[] jogo) {
    for (Aposta aposta : apostas) {
      Integer[] integerArray = new Integer[aposta.getBolasSorteadas().size()];
      integerArray = aposta.getBolasSorteadas().toArray(integerArray);
      
      if (Utils.arraysAreEqual(integerArray, jogo)) {
        System.out.println("Sorteio com os mesmos números:" + aposta.getConcurso() + " - " + aposta.getDataSorteio());
      }

    }
  }
}
