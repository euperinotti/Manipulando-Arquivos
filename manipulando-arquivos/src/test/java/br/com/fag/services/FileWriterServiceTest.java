package br.com.fag.services;

import java.io.IOException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.infra.ResourceLoader;

public class FileWriterServiceTest {

  private FileWriterService sut;

  @BeforeEach
  void setService() {
    sut = new FileWriterService();
  }

  @Test
  void shouldWriteANewFile() throws IOException {
    sut.start();
    ClassLoader classLoader = ResourceLoader.class.getClassLoader();
    InputStream inputStream = classLoader.getResourceAsStream("resultado.txt");

    Assertions.assertTrue(inputStream != null);
  }
}
