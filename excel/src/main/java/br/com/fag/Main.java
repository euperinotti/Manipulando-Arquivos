package br.com.fag;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import br.com.fag.controllers.ApostaController;
import br.com.fag.domain.entities.Analisa;
import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.usecases.JogosSemGanhadorSeisAcertos;
import br.com.fag.domain.usecases.MaiorValorParaApostasComCincoDezenas;
import br.com.fag.domain.usecases.MaiorValorParaApostasComQuatroDezenas;
import br.com.fag.domain.usecases.MaiorValorParaApostasComSeisDezenas;
import br.com.fag.domain.usecases.MenorValorParaApostasComCincoDezenas;
import br.com.fag.domain.usecases.MenorValorParaApostasComQuatroDezenas;
import br.com.fag.domain.usecases.MenorValorParaApostasComSeisDezenas;
import br.com.fag.domain.usecases.QuantasVezesCadaNumeroFoiSorteado;
import br.com.fag.domain.usecases.QuantidadeDeGanhadoresComCincoDezenas;
import br.com.fag.domain.usecases.QuantidadeDeGanhadoresComQuatroDezenas;
import br.com.fag.domain.usecases.QuantidadeDeGanhadoresComSeisDezenas;
import br.com.fag.infra.FileOpener;
import br.com.fag.interfaces.IAnalise;
import br.com.fag.utils.RandomGame;

public class Main {
    public static void main(String[] args) {
        List<IAnalise> dependencias = Stream
                .of(new JogosSemGanhadorSeisAcertos(),
                        new MenorValorParaApostasComQuatroDezenas(),
                        new MenorValorParaApostasComCincoDezenas(),
                        new MenorValorParaApostasComSeisDezenas(),
                        new MaiorValorParaApostasComQuatroDezenas(),
                        new MaiorValorParaApostasComCincoDezenas(),
                        new MaiorValorParaApostasComSeisDezenas(),
                        new QuantasVezesCadaNumeroFoiSorteado(),
                        new QuantidadeDeGanhadoresComQuatroDezenas(),
                        new QuantidadeDeGanhadoresComCincoDezenas(),
                        new QuantidadeDeGanhadoresComSeisDezenas())
                .collect(Collectors.toList());
        Analisa analisa = new Analisa();
        
        Integer[] jogoAleatorio = RandomGame.generate();

        List<Aposta> listaApostas = new FileOpener().read();
        ApostaController apostaController = new ApostaController(listaApostas, dependencias);
        apostaController.handle();
        System.out.println(analisa.toString());
    }
}