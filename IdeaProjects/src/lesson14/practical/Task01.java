package lesson14.practical;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task01 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("bla", "", "simp", "", "second", "third", "third", "sec", "blablabla");
        System.out.println("Original list is: " + stringList);
        int numberOfEmpty = (int) stringList.stream()
                .filter(String::isEmpty)
                .count();
        System.out.println("Number of empty element is: " + numberOfEmpty);

        List<String> withoutEmpty = stringList.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
        System.out.println("List without empty elements: " + withoutEmpty);

        String upperCaseString = withoutEmpty.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("UpperCase String separated with ',': " + upperCaseString);
    }
}
