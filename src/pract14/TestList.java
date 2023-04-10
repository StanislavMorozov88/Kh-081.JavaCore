package pract14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestList {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");


        System.out.println(list);

        List<String> empty = list.stream()
                .filter(string -> string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("The count of empty strings is: " + empty.stream().count());


        List<String> filtered = list.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Without empty strings: " + filtered);

        List<String> upper = Collections.singletonList(list.stream()
                .filter(string -> !string.isEmpty())
                .map(String::toUpperCase)
                .collect(Collectors.joining(", ")));
        System.out.println("To upper cases: " + upper);


    }
}
