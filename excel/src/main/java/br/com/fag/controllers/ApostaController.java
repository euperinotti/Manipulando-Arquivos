package br.com.fag.controllers;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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
import br.com.fag.interfaces.IAnalise;

public class ApostaController {
  private List<IAnalise> dependencias;
  private List<Aposta> apostas;

  public ApostaController(List<Aposta> apostas) {
    this.apostas = apostas;
  }

  public void handle() {
    for (Aposta aposta : this.getApostas()) {
      this.getDependencias().forEach(lib -> {
        lib.run(aposta);
      });
    }
  }

  public ApostaController prepare() {
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
    this.dependencias = dependencias;
    return this;
  }

  public List<IAnalise> getDependencias() {
    return this.dependencias;
  }

  public List<Aposta> getApostas() {
    return this.apostas;
  }

}
