package br.com.fag.infra;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class ResourceLoader {
  public InputStream run() throws FileNotFoundException {
    ClassLoader classLoader = ResourceLoader.class.getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream("Mega-Sena.xlsx");

    if (inputStream != null) {
      return inputStream;
    } else {
      throw new FileNotFoundException("Nenhum arquivo encontrado!");
    }
  }
}
