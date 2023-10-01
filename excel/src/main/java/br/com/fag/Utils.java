package br.com.fag;

public class Utils {
  public static Double parseStringToDouble(String str) {
    return Double.parseDouble(str.substring(2, str.length()).replace(".", "").replace(",", "."));
  }

  public static boolean arraysAreEqual(Integer[] array1, Integer[] array2) {
    if (array1.length != array2.length) {
        return false;
    }

    for (int i = 0; i < array1.length; i++) {
        if (array1[i] != array2[i]) {
            return false;
        }
    }

    return true;
}
}
