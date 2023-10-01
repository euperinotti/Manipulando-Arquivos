package br.com.fag;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class CarregaArquivo {
  public InputStream run() throws FileNotFoundException {
    ClassLoader classLoader = CarregaArquivo.class.getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream("Mega-Sena.xlsx");

    if (inputStream != null) {
      return inputStream;
    } else {
      throw new FileNotFoundException("Resource not found!");
    }
  }
}
