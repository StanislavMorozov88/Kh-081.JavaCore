package com.softserve.edu13.practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void sortStrings(List<String> strings) {
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
    }

  public static void main(String[] args) {
    List<String> strings = Arrays.asList("foo", "bar", "baz");
    sortStrings(strings);
    System.out.println(strings);
  }
}
