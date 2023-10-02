package br.com.fag.utils;

import java.util.Random;

import br.com.fag.domain.entities.Analisa;

public class RandomGame {
  public static Integer[] generate() {
    Integer[] random = { new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1,
        new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1 };
    
    Analisa.jogoSorteado = random;

    return random;
  }
}
