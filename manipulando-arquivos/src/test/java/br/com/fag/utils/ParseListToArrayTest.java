package br.com.fag.utils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ParseListToArrayTest {
  @Test
  void shouldReturnAnArrayOfInteger() {
    List<Integer> list = Stream.of(0,0,0,0,0).collect(Collectors.toList());
    Integer[] arr = ParseListToArray.parse(list);

    Assertions.assertTrue(arr instanceof Integer[]);
  }
}
