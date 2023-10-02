package br.com.fag.domain.entities;

import java.util.HashMap;
import java.util.Map;

public class Analisa {
  public static Integer jogosSemGanhadorSeisAcertos = 0;
  public static Double menorValorParaApostasComQuatroDezenas = 1000000000d;
  public static Double menorValorParaApostasComCincoDezenas = 1000000000d;
  public static Double menorValorParaApostasComSeisDezenas = 1000000000d;
  public static Double maiorValorParaApostasComQuatroDezenas = 0d;
  public static Double maiorValorParaApostasComCincoDezenas = 0d;
  public static Double maiorValorParaApostasComSeisDezenas = 0d;
  public static Integer quantidadeDeGanhadoresComQuatroDezenas = 0;
  public static Integer quantidadeDeGanhadoresComCincoDezenas = 0;
  public static Integer quantidadeDeGanhadoresComSeisDezenas = 0;
  public static Map<Integer, Integer> quantasVezesCadaNumeroFoiSorteado = new HashMap<>();
  public static Integer[] jogoSorteado;
  
  @Override
  public String toString() {
    return "{" +
      " quantasVezesCadaNumeroFoiSorteado='" + quantasVezesCadaNumeroFoiSorteado + "'" +
      ", jogosSemGanhadorSeisAcertos='" + jogosSemGanhadorSeisAcertos + "'" +
      ", menorValorParaApostasComQuatroDezenas='" + menorValorParaApostasComQuatroDezenas + "'" +
      ", menorValorParaApostasComCincoDezenas='" + menorValorParaApostasComCincoDezenas + "'" +
      ", menorValorParaApostasComSeisDezenas='" + menorValorParaApostasComSeisDezenas + "'" +
      ", maiorValorParaApostasComQuatroDezenas='" + maiorValorParaApostasComQuatroDezenas + "'" +
      ", maiorValorParaApostasComCincoDezenas='" + maiorValorParaApostasComCincoDezenas + "'" +
      ", maiorValorParaApostasComSeisDezenas='" + maiorValorParaApostasComSeisDezenas + "'" +
      ", quantidadeDeGanhadoresComQuatroDezenas='" + quantidadeDeGanhadoresComQuatroDezenas + "'" +
      ", quantidadeDeGanhadoresComCincoDezenas='" + quantidadeDeGanhadoresComCincoDezenas + "'" +
      ", quantidadeDeGanhadoresComSeisDezenas='" + quantidadeDeGanhadoresComSeisDezenas + "'" +
      "}";
  }
}
