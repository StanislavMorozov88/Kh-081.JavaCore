package pract13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortedStrings {
    public static void sortStrings(List<String> strings) {
        Collections.sort(strings, (s1, s2) -> s1.compareTo(s2));
    }

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaa", "fff", "ddd", "ggg", "mmm");
        sortStrings(strings);
        System.out.println(strings);
    }
}
