package br.com.fag.services;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.fag.infra.ResourceLoader;

public class FileWriterServiceTest {

  @Test
  void shouldWriteANewFile() throws IOException {
    ClassLoader classLoader = ResourceLoader.class.getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream("resultado.txt");

    Assertions.assertTrue(inputStream != null);
  }
}
