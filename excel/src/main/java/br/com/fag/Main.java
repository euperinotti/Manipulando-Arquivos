package br.com.fag;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.infra.FileOpener;

public class Main {
    public static void main(String[] args) {

        System.out.println("Insira 6 números para jogar");
        Integer[] numeros = {0,0,0,0,0,0};
        Integer i = 0;
        Scanner scanner = new Scanner(System.in);

        while(i < 6) {
            System.out.print("input: ");
            numeros[i] = scanner.nextInt();
            
            i++;
        }

        Integer[] jogoAleatorio = {new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1};

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
        analisa.procuraJogo(listaApostas, numeros);
        analisa.procuraJogo(listaApostas, jogoAleatorio);

        System.out.println("Numeros do sistema: " + jogoAleatorio.toString());

        scanner.close();
    }
}