package br.com.fag.infra;

import java.io.FileNotFoundException;
import java.io.InputStream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ResourceLoaderTest {

  private ResourceLoader sut;

  @BeforeEach
  void setSut() {
    sut = new ResourceLoader();
  }

  @Test
  void shouldLoadAFileFromResourceFolder() throws FileNotFoundException {
    InputStream file = sut.run();

    Assertions.assertNotNull(file);
    
  }
}
