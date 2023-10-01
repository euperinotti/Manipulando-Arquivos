package br.com.fag.infra;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.apache.poi.xssf.usermodel.XSSFCell;

import br.com.fag.domain.entities.Aposta;
import br.com.fag.domain.entities.Rateio;
import br.com.fag.utils.ParseDoubleToInteger;
import br.com.fag.utils.ParseStringToDouble;

public enum ColumnMapper {
  CONCURSO() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      double val = Double.parseDouble(cell.toString());
      aposta.setConcurso((int) Math.floor(val));
    }
  },
  DATA() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
      String date = cell.toString();
      LocalDate localDate = LocalDate.parse(date, formatter);
      aposta.setDataSorteio(localDate);
    }
  },
  BOLA1() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getBolasSorteadas().add(0, ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  BOLA2() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getBolasSorteadas().add(1, ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  BOLA3() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getBolasSorteadas().add(2, ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  BOLA4() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getBolasSorteadas().add(3, ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  BOLA5() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getBolasSorteadas().add(4, ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  BOLA6() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getBolasSorteadas().add(5, ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  GANHADORES_SEIS_DEZENAS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getRateios()[0] = new Rateio();
      aposta.getRateios()[0].setNumeroDeDezenas(6);
      aposta.getRateios()[0]
          .setQuantidadeDeGanhadores(ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  LOCAL() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.setLocal(cell.toString());
    }
  },
  RATEIO_SEIS_DEZENAS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getRateios()[0]
          .setValorRateio(ParseStringToDouble.parse(cell.toString()));
    }
  },
  GANHADORES_CINCO_DEZENAS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getRateios()[1] = new Rateio();
      aposta.getRateios()[1].setNumeroDeDezenas(5);
      aposta.getRateios()[1]
          .setQuantidadeDeGanhadores(ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  RATEIO_CINCO_DEZENAS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getRateios()[1]
          .setValorRateio(ParseStringToDouble.parse(cell.toString()));
    }
  },
  GANHADORES_QUATRO_DEZENAS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getRateios()[2] = new Rateio();
      aposta.getRateios()[2].setNumeroDeDezenas(4);
      aposta.getRateios()[2]
          .setQuantidadeDeGanhadores(ParseDoubleToInteger.parse(ParseStringToDouble.parse(cell.toString())));
    }
  },
  RATEIO_QUATRO_DEZENAS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.getRateios()[2]
          .setValorRateio(ParseStringToDouble.parse(cell.toString()));
    }
  },
  ACUMULADO_SEIS_ACERTOS() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.setAcumulado6Acertos(ParseStringToDouble.parse(cell.toString()));
    }
  },
  ARRECADACAO_TOTAL() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.setArrecadacaoTotal(ParseStringToDouble.parse(cell.toString()));
    }
  },
  ESTIMATIVA_DE_PREMIO() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.setEstimativaDePremio(ParseStringToDouble.parse(cell.toString()));
    }
  },
  ACUMULADO_ESPECIAL() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.setAcumuladoEspecial(ParseStringToDouble.parse(cell.toString()));
    }
  },
  OBSERVACAO() {
    @Override
    public void map(Aposta aposta, XSSFCell cell) {
      aposta.setObservacao(cell.toString());
    }
  };


  public abstract void map(Aposta aposta, XSSFCell cell);
}
