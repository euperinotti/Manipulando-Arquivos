package br.com.fag.utils;

public class ParseStringToDouble {
  public static Double parse(String str) {
    return Double.parseDouble(str.substring(2, str.length()).replace(".", "").replace(",", "."));
  }
}
