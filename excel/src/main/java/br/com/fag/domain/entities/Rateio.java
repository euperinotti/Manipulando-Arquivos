package br.com.fag.domain.entities;

public class Rateio {
  private Integer numeroDeDezenas;
  private Integer quantidadeDeGanhadores;
  private Long valorRateio;

  public Rateio() {
  }

  public Rateio(Integer numeroDeDezenas, Integer quantidadeDeGanhadores, Long valorRateio) {
    this.numeroDeDezenas = numeroDeDezenas;
    this.quantidadeDeGanhadores = quantidadeDeGanhadores;
    this.valorRateio = valorRateio;
  }

  public Integer getNumeroDeDezenas() {
    return this.numeroDeDezenas;
  }

  public void setNumeroDeDezenas(Integer numeroDeDezenas) {
    this.numeroDeDezenas = numeroDeDezenas;
  }

  public Integer getQuantidadeDeGanhadores() {
    return this.quantidadeDeGanhadores;
  }

  public void setQuantidadeDeGanhadores(Integer quantidadeDeGanhadores) {
    this.quantidadeDeGanhadores = quantidadeDeGanhadores;
  }

  public Long getValorRateio() {
    return this.valorRateio;
  }

  public void setValorRateio(Long valorRateio) {
    this.valorRateio = valorRateio;
  }

  @Override
  public String toString() {
    return "{" +
      " numeroDeDezenas='" + getNumeroDeDezenas() + "'" +
      ", quantidadeDeGanhadores='" + getQuantidadeDeGanhadores() + "'" +
      ", valorRateio='" + getValorRateio()+ "'" +
      "}";
  }

}
