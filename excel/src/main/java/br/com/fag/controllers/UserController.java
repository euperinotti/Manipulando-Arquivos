package br.com.fag.controllers;

import java.util.Scanner;

public class UserController {
  public Integer[] handle() {
    System.out.println("Forme seu jogo da Mega Sena");
    Integer[] numeros = { 0, 0, 0, 0, 0, 0 };
    Integer i = 0;
    Scanner scanner = new Scanner(System.in);

    while (i < 6) {
      System.out.print("..: ");
      numeros[i] = scanner.nextInt();

      i++;
    }

    scanner.close();
    return numeros;
  }
}
