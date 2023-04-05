package com.softserve.lesson10.homeTask;

import java.util.HashSet;
import java.util.Set;

public class HomeTask1 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(4);

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union(set1, set2));
        System.out.println(intersection(set1, set2));
    }

    public static Set<Integer> union(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> result = set1;
        result.addAll(set2);
        return result;
    }

    public static Set<Integer> intersection(Set<Integer> set1, Set<Integer> set2){

        Set<Integer> result = set1;
        result.retainAll(set2);
        return result;
    }

}
