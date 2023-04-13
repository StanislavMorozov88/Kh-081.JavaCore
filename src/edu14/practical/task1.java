package edu14.practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class task1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp",
                "", "second", "third", "third", "sec", "blablabla");

           int count = (int) list.stream().filter(String::isEmpty).count();
           System.out.println("Count empty strings are " + count);

           List<String> listWithoutEmpty = list.stream().filter(string -> !string.isEmpty()).
                   collect(Collectors.toList());
            System.out.println(listWithoutEmpty);

            String joinUpperCase = listWithoutEmpty.stream().map(string -> string.toUpperCase()).
                   collect(Collectors.joining(", "));
            System.out.println(joinUpperCase);

    }
}
