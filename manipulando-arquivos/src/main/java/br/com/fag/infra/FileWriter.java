package br.com.fag.infra;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

import br.com.fag.domain.entities.Resultado;

public class FileWriter {
  public void write() {
    String fileName = "manipulando-arquivos/src/main/resources/resultado.txt";
    Resultado resultado = new Resultado();
    String content = resultado.toString();

    try {
      Path filePath = Path.of(fileName);
      Files.writeString(filePath, content, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
      System.out.println("Resultado disponível em.: " + fileName);
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}
