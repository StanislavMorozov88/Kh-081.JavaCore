package streams14;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("Hello");
        list.add("Hey");
        list.add("Hi");
        list.add("Good bye");
        list.add("How are you?");

        List<Integer> list2 = list.stream()
                .map(element -> element.length())
                .collect(Collectors.toList());

        System.out.println("new List" + list2);

    }
}
