package com.softserve.edu10;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();

        mySet.add("Java");
        mySet.add("Python");
        mySet.add("JavaScript");
        mySet.add("Java");
        mySet.add(null);


        System.out.println(mySet);

        if (mySet.contains("PHP")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
       // mySet.remove("Python");
        System.out.println(mySet);

        System.out.println(mySet.size());

        Set<String> newSet = new HashSet<>();

        newSet.add("Java");
        newSet.add("PHP");
        newSet.add("JavaScript");

        Set<String> union = new HashSet<>(mySet);
        union.addAll(newSet);
        System.out.println(union);

        Set<String> intersection = new HashSet<>(mySet);
        intersection.retainAll(newSet);
        System.out.println(intersection);

        Set<String> difSet = new HashSet<>(mySet);
        difSet.removeAll(newSet);
        System.out.println(difSet);



    }
}
