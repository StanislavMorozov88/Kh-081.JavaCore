package com.softserve.edu13;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("How are you");
        list.add("Thanks");
        list.add("See you");
        list.add("Good bye");
        // list.removeIf(element->element.length()>5);
        Predicate<String> list1 = element -> element.length() < 8;
        list.removeIf(list1);
        System.out.println(list);
    }
}
