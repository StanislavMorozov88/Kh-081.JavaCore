package edu10.homework;

import java.util.HashSet;
import java.util.Set;

public class SetTask {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1);
        intersectionSet.retainAll(set2);
        return intersectionSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("apple");
        set1.add("banana");
        set1.add("orange");

        Set<String> set2 = new HashSet<>();
        set2.add("orange");
        set2.add("kiwi");
        set2.add("pineapple");

        Set<String> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<String> intersectionSet = intersect(set1, set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
