package br.com.fag.domain.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.fag.utils.ParseLongToCurrency;

public class Resultado {
  public static Integer jogosSemGanhadorSeisAcertos = 0;
  public static Long menorValorParaApostasComQuatroDezenas = 1000000000L;
  public static Long menorValorParaApostasComCincoDezenas = 1000000000L;
  public static Long menorValorParaApostasComSeisDezenas = 1000000000L;
  public static Long maiorValorParaApostasComQuatroDezenas = 0L;
  public static Long maiorValorParaApostasComCincoDezenas = 0L;
  public static Long maiorValorParaApostasComSeisDezenas = 0L;
  public static Integer quantidadeDeGanhadoresComQuatroDezenas = 0;
  public static Integer quantidadeDeGanhadoresComCincoDezenas = 0;
  public static Integer quantidadeDeGanhadoresComSeisDezenas = 0;
  public static Map<Integer, Integer> quantasVezesCadaNumeroFoiSorteado = new HashMap<>();
  public static List<Integer> jogoSorteado = new ArrayList<>();
  public static List<Integer> jogoEscolhido = new ArrayList<>();
  public static String jogoEncontrado = "";
  
  @Override
  public String toString() {
    return "{\n" +
      " quantasVezesCadaNumeroFoiSorteado='" + quantasVezesCadaNumeroFoiSorteado + "'\n" +
      "jogosSemGanhadorSeisAcertos='" + jogosSemGanhadorSeisAcertos + "'\n" +
      "menorValorParaApostasComQuatroDezenas='" + ParseLongToCurrency.parse(menorValorParaApostasComQuatroDezenas) + "'\n" +
      "menorValorParaApostasComCincoDezenas='" + ParseLongToCurrency.parse(menorValorParaApostasComCincoDezenas) + "'\n" +
      "menorValorParaApostasComSeisDezenas='" + ParseLongToCurrency.parse(menorValorParaApostasComSeisDezenas) + "'\n" +
      "maiorValorParaApostasComQuatroDezenas='" + ParseLongToCurrency.parse(maiorValorParaApostasComQuatroDezenas) + "'\n" +
      "maiorValorParaApostasComCincoDezenas='" + ParseLongToCurrency.parse(maiorValorParaApostasComCincoDezenas) + "'\n" +
      "maiorValorParaApostasComSeisDezenas='" + ParseLongToCurrency.parse(maiorValorParaApostasComSeisDezenas) + "'\n" +
      "quantidadeDeGanhadoresComQuatroDezenas='" + quantidadeDeGanhadoresComQuatroDezenas + "'\n" +
      "quantidadeDeGanhadoresComCincoDezenas='" + quantidadeDeGanhadoresComCincoDezenas + "'\n" +
      "quantidadeDeGanhadoresComSeisDezenas='" + quantidadeDeGanhadoresComSeisDezenas + "'\n" +
      "jogoSorteado='" + jogoSorteado.toString() + "'\n" +
      "jogoEscolhido='" + jogoEscolhido.toString() + "'\n" +
      "jogoEncontrado='" + jogoEncontrado + "'\n" +
      "}";
  }
}
