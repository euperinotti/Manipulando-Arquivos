package br.com.fag;

import java.util.Date;

public class Aposta {
  private Integer concurso;
  private Date dataSorteio;
  private Integer[] bolasSorteadas;
  private Integer ganhadores6Acertos;
  private String local;
  private Double rateio6Acertos;
  private Integer ganhadores5Acertos;
  private Double rateio5Acertos;
  private Integer ganhadores4Acertos;
  private Double rateio4Acertos;
  private Double acumulado6Acertos;
  private Double arrecadacaoTotal;
  private Double estimativaDePremio;
  private String observacao;

  public Aposta() {
  }


  public Integer getConcurso() {
    return this.concurso;
  }

  public void setConcurso(Integer concurso) {
    this.concurso = concurso;
  }

  public Date getDataSorteio() {
    return this.dataSorteio;
  }

  public void setDataSorteio(Date dataSorteio) {
    this.dataSorteio = dataSorteio;
  }

  public Integer[] getBolasSorteadas() {
    return this.bolasSorteadas;
  }

  public void setBolasSorteadas(Integer[] bolasSorteadas) {
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

  public Double getRateio6Acertos() {
    return this.rateio6Acertos;
  }

  public void setRateio6Acertos(Double rateio6Acertos) {
    this.rateio6Acertos = rateio6Acertos;
  }

  public Integer getGanhadores5Acertos() {
    return this.ganhadores5Acertos;
  }

  public void setGanhadores5Acertos(Integer ganhadores5Acertos) {
    this.ganhadores5Acertos = ganhadores5Acertos;
  }

  public Double getRateio5Acertos() {
    return this.rateio5Acertos;
  }

  public void setRateio5Acertos(Double rateio5Acertos) {
    this.rateio5Acertos = rateio5Acertos;
  }

  public Integer getGanhadores4Acertos() {
    return this.ganhadores4Acertos;
  }

  public void setGanhadores4Acertos(Integer ganhadores4Acertos) {
    this.ganhadores4Acertos = ganhadores4Acertos;
  }

  public Double getRateio4Acertos() {
    return this.rateio4Acertos;
  }

  public void setRateio4Acertos(Double rateio4Acertos) {
    this.rateio4Acertos = rateio4Acertos;
  }

  public Double getAcumulado6Acertos() {
    return this.acumulado6Acertos;
  }

  public void setAcumulado6Acertos(Double acumulado6Acertos) {
    this.acumulado6Acertos = acumulado6Acertos;
  }

  public Double getArrecadacaoTotal() {
    return this.arrecadacaoTotal;
  }

  public void setArrecadacaoTotal(Double arrecadacaoTotal) {
    this.arrecadacaoTotal = arrecadacaoTotal;
  }

  public Double getEstimativaDePremio() {
    return this.estimativaDePremio;
  }

  public void setEstimativaDePremio(Double estimativaDePremio) {
    this.estimativaDePremio = estimativaDePremio;
  }

  public String getObservacao() {
    return this.observacao;
  }

  public void setObservacao(String observacao) {
    this.observacao = observacao;
  }

  
}
