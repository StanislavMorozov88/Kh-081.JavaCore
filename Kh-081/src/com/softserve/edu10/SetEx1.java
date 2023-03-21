package com.softserve.edu10;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx1 {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("1");
        set.add("2");
        set.add("4");
        set.add("8");
        set.add("6");
        set.add("3");
        set.add("7");
        set.add("10");
        set.add("9");
        set.first();
        System.out.println(set.headSet("3"));
        System.out.println(set.tailSet("7"));
       // System.out.println(set);
        System.out.println(set);

    }
}
