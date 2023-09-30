package br.com.fag;

public class Utils {
  public static Double parseStringToDouble(String str) {
    return Double.parseDouble(str.substring(2, str.length()).replace(".", "").replace(",", "."));
  }
}
