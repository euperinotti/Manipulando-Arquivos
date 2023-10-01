package br.com.fag.utils;

public class FilterString {
  public static String sanitize(String str) {
    return str.substring(2, str.length()).replace(".", "").replace(",", ".");
  }
}
