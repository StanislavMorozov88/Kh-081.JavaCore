package com.softserve.edu10;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        List<String> list = List.of("Mike", "Alex");
        set.add("Mike");
        set.add("Nike");
        set.add("Alex");
        for (String object : set) {
            System.out.println(object);
        }
        // add an element that already exists in the collection
        boolean addElement = set.add("Sara");
        System.out.println("First element: " + addElement);

        // count of elements in the collection
        int count = set.size();
        System.out.println("Count of elements : " + count);

        // is there an element in the collection
        boolean isContains = set.contains("First");
        System.out.println("Contains the given element : " + isContains);

        // removes all elements from the calling collection
        System.out.println("=============================");

        set.removeAll(list);
        for (String object : set) {
            System.out.println(object);
        }

        // removes all elements except those from the calling collection
        set.retainAll(list);
    }
}