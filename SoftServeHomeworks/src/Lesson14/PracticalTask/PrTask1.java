package Lesson14.PracticalTask;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrTask1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        long emptyStrs = list.stream()
                .filter(x->x.isEmpty())
                .count();
        System.out.println("There are " + emptyStrs + " empty elements");

        List<String> withoutEmptyStrs = list.stream()
                .filter(x -> !x.isEmpty())
                .collect(Collectors.toList());
        System.out.println("Without empty strings" + withoutEmptyStrs);

        String upperCase = withoutEmptyStrs.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(upperCase);
    }
}
