package edu13.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringTask {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "orange", "pear");
        List<String> sortedStrings = strings.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedStrings);
    }
}
