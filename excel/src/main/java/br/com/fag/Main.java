package br.com.fag;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Aposta> listaApostas = new FileOpener().read();
        Analisa analisa = new Analisa();
        analisa.quantidadeDeVezesCadaNumeroFoiSorteado(listaApostas);
        analisa.nenhumGanhadorSeisAcertos(listaApostas);
        analisa.menorValorParaApostasComQuatroDezenas(listaApostas);
        analisa.menorValorParaApostasComCincoDezenas(listaApostas);
        analisa.menorValorParaApostasComSeisDezenas(listaApostas);
        analisa.quantidadeDeGanhadoresQuatroDezenas(listaApostas);
        analisa.quantidadeDeGanhadoresCincoDezenas(listaApostas);
        analisa.quantidadeDeGanhadoresSeisDezenas(listaApostas);
    }
}