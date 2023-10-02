package br.com.fag.services;

import java.util.List;

import br.com.fag.infra.FileWriter;
import br.com.fag.interfaces.IService;

public class FileWriterService implements IService {

  @Override
  public List<Boolean> start() {
    new FileWriter().write();
    return null;
  }
  
}
