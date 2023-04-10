package edu13.practical;

import java.util.ArrayList;
import java.util.List;

public class task3 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Abc");
        list.add("Hello Java!");
        list.add("Good bye!");
        list.add("How are you?");
        list.add("Hi Mike!");
        list.add("Prom pom pom");

        System.out.println(list);

        list.sort((s1,s2) -> {
            if (s1.length() > s2.length()) return 1;
            else if (s1.length() < s2.length()) return -1;
            else return 0;
        });

        list.forEach(System.out::println);
    }
}
