package com.softserve.lesson13.practicalTask;

import java.util.Arrays;
import java.util.List;

public class Practical3 {
    public static void sortStrings(List<String> strings) {
        strings.sort(String::compareTo);
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("foo", "bar", "baz");
        sortStrings(strings);
        System.out.println(strings);
    }
}
