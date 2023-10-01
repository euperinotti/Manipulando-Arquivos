package br.com.fag.domain.entities;

public class Rateio {
  private Integer numeroDeDezenas;
  private Integer quantidadeDeGanhadores;
  private Double valorRateio;

  public Rateio() {
  }

  public Rateio(Integer numeroDeDezenas, Integer quantidadeDeGanhadores, Double valorRateio) {
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

  public Double getValorRateio() {
    return this.valorRateio;
  }

  public void setValorRateio(Double valorRateio) {
    this.valorRateio = valorRateio;
  }

}
