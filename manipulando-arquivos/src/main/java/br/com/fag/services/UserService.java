package br.com.fag.services;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import br.com.fag.domain.entities.Resultado;
import br.com.fag.interfaces.IService;

public class UserService implements IService {
  public List<Integer> start() {
    System.out.println("Forme seu jogo da Mega Sena");
    Integer[] numeros = { 0, 0, 0, 0, 0, 0 };
    Integer i = 0;
    Scanner scanner = new Scanner(System.in);

    while (i < 6) {
      System.out.print("..: ");
      numeros[i] = scanner.nextInt();

      i++;
    }

    setGamble(Arrays.asList(numeros));
    scanner.close();
    return Arrays.asList(numeros);
  }

  public void setGamble(List<Integer> numeros) {
    Resultado.jogoEscolhido = numeros;
  }
}
