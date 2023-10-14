package br.com.fag.infra;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.fag.domain.entities.Aposta;

public class FileOpenerTest {

  private FileOpener sut;

  @BeforeEach
  void setSut() {
    sut = new FileOpener();
  }
  
  @Test
  void shouldReturnAListOfGamblesFromAFile() {
    List<Aposta> result = sut.read();

    Assertions.assertNotNull(result);
    
  }
}
