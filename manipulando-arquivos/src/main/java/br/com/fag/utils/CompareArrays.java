package br.com.fag.utils;

public class CompareArrays {
  public static boolean compare(Integer[] arrA, Integer[] arrB) {
    if (arrA.length != arrB.length) {
      return false;
    }

    for (int i = 0; i < arrA.length; i++) {
      if (arrA[i] != arrB[i]) {
        return false;
      }
    }

    return true;
  }
}
