package br.com.fag.domain.entities;

import java.util.HashMap;
import java.util.Map;

public class Analisa {
  public static Integer quantasVezesCadaNumeroFoiSorteado;
  public static Integer jogosSemGanhadorSeisAcertos;
  public static Double menorValorParaApostasComQuatroDezenas;
  public static Double menorValorParaApostasComCincoDezenas;
  public static Double menorValorParaApostasComSeisDezenas;
  public static Double maiorValorParaApostasComQuatroDezenas;
  public static Double maiorValorParaApostasComCincoDezenas;
  public static Double maiorValorParaApostasComSeisDezenas;
  public static Integer quantidadeDeGanhadoresComQuatroDezenas;
  public static Integer quantidadeDeGanhadoresComCincoDezenas;
  public static Integer quantidadeDeGanhadoresComSeisDezenas;
  public static Map<Integer, Integer> listaDeNumeros = new HashMap<>();
}
