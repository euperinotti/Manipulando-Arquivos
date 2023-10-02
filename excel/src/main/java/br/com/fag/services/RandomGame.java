package br.com.fag.services;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.interfaces.IService;

public class RandomGame implements IService {
  public List<Integer> start() {
    Integer[] random = { new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1,
        new Random().nextInt(60) + 1, new Random().nextInt(60) + 1, new Random().nextInt(60) + 1 };
    
    Resultado.jogoSorteado = Arrays.asList(random);

    return Arrays.asList(random);
  }
}
