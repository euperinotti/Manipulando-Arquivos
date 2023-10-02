package br.com.fag.domain.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class Aposta {
  private Integer concurso;
  private LocalDate dataSorteio;
  private ArrayList<Integer> bolasSorteadas;
  private Integer ganhadores6Acertos;
  private String local;
  private Long acumulado6Acertos;
  private Long arrecadacaoTotal;
  private Long estimativaDePremio;
  private Long acumuladoEspecial;
  private String observacao;
  private Rateio[] rateios;

  public Aposta() {
    this.rateios = new Rateio[3];
    this.bolasSorteadas = new ArrayList<Integer>();
  }

  public Integer getConcurso() {
    return this.concurso;
  }

  public void setConcurso(Integer concurso) {
    this.concurso = concurso;
  }

  public LocalDate getDataSorteio() {
    return this.dataSorteio;
  }

  public void setDataSorteio(LocalDate dataSorteio) {
    this.dataSorteio = dataSorteio;
  }

  public ArrayList<Integer> getBolasSorteadas() {
    return this.bolasSorteadas;
  }

  public void setBolasSorteadas(ArrayList<Integer> bolasSorteadas) {
    this.bolasSorteadas = bolasSorteadas;
  }

  public Integer getGanhadores6Acertos() {
    return this.ganhadores6Acertos;
  }

  public void setGanhadores6Acertos(Integer ganhadores6Acertos) {
    this.ganhadores6Acertos = ganhadores6Acertos;
  }

  public String getLocal() {
    return this.local;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public Long getAcumulado6Acertos() {
    return this.acumulado6Acertos;
  }

  public void setAcumulado6Acertos(Long acumulado6Acertos) {
    this.acumulado6Acertos = acumulado6Acertos;
  }

  public Long getArrecadacaoTotal() {
    return this.arrecadacaoTotal;
  }

  public void setArrecadacaoTotal(Long arrecadacaoTotal) {
    this.arrecadacaoTotal = arrecadacaoTotal;
  }

  public Long getEstimativaDePremio() {
    return this.estimativaDePremio;
  }

  public void setEstimativaDePremio(Long estimativaDePremio) {
    this.estimativaDePremio = estimativaDePremio;
  }

  public String getObservacao() {
    return this.observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  public Long getAcumuladoEspecial() {
    return this.acumuladoEspecial;
  }

  public void setAcumuladoEspecial(Long acumuladoEspecial) {
    this.acumuladoEspecial = acumuladoEspecial;
  }

  public Rateio[] getRateios() {
    return this.rateios;
  }

  public void setRateios(Rateio[] rateios) {
    this.rateios = rateios;
  }

  @Override
  public String toString() {
    return "{" +
      " concurso='" + getConcurso() + "'" +
      ", dataSorteio='" + getDataSorteio() + "'" +
      ", bolasSorteadas='" + getBolasSorteadas() + "'" +
      ", ganhadores6Acertos='" + getGanhadores6Acertos() + "'" +
      ", local='" + getLocal() + "'" +
      ", acumulado6Acertos='" + getAcumulado6Acertos() + "'" +
      ", arrecadacaoTotal='" + getArrecadacaoTotal() + "'" +
      ", estimativaDePremio='" + getEstimativaDePremio() + "'" +
      ", acumuladoEspecial='" + getAcumuladoEspecial() + "'" +
      ", observacao='" + getObservacao() + "'" +
      ", rateios6='" + getRateios()[0] + "'" +
      ", rateios5='" + getRateios()[1] + "'" +
      ", rateios4='" + getRateios()[2] + "'" +
      "}";
  }
  
}
