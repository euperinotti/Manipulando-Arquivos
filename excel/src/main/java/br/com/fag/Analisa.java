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
  }

  public void nenhumGanhadorSeisAcertos(List<Aposta> apostas) {
    Integer valor = 0;
    for (Aposta aposta : apostas) {
      if(aposta.getGanhadores6Acertos() == 0 || aposta.getGanhadores6Acertos() == null) {
        valor++;
      }
    }
  }

  public void menorValorParaApostasComQuatroDezenas(List<Aposta> apostas) {
    Double valor = 1000000000d;
    for (Aposta aposta : apostas) {
      if(aposta.getRateio4Acertos() < valor) {
        valor = aposta.getRateio4Acertos();
      }
    }

    System.out.println(valor);
  }

  public void menorValorParaApostasComCincoDezenas(List<Aposta> apostas) {
    Double valor = 1000000000d;
    for (Aposta aposta : apostas) {
      if(aposta.getRateio5Acertos() < valor) {
        valor = aposta.getRateio5Acertos();
      }
    }

    System.out.println(valor);
  }

  public void menorValorParaApostasComSeisDezenas(List<Aposta> apostas) {
    Double valor = 1000000000d;
    for (Aposta aposta : apostas) {
      if(aposta.getRateio6Acertos() < valor) {
        valor = aposta.getRateio6Acertos();
      }
    }

    System.out.println(valor);
  }
}
