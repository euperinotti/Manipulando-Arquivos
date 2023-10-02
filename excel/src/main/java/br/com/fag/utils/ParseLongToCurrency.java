package br.com.fag.utils;

import java.text.NumberFormat;
import java.util.Locale;

public class ParseLongToCurrency {
  public static String parse(Long num) {
    Locale brazilianLocale = new Locale("pt", "BR");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(brazilianLocale);
    currencyFormatter.setMaximumFractionDigits(2);
    String formattedCurrency = currencyFormatter.format(num / 100.0);

    return formattedCurrency;
  }
}
