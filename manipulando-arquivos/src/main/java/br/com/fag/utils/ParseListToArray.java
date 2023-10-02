package br.com.fag.utils;

import java.util.List;

public class ParseListToArray {
  public static Integer[] parse(List<Integer> lista) {
    Integer[] arr = lista.toArray(new Integer[0]);
    return arr;
  }
}
