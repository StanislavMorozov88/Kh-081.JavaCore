package edu10.homework;
import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class task1 {
    public static Set<Integer> union (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);
        return union;
    }

    public static Set<Integer> intersect (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> intersect = new HashSet<>(set1);
        intersect.retainAll(set2);
        return intersect;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);

        Set<Integer> set2 = new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        set2.add(8);

        Set<Integer> unionSet = task1.union(set1,set2);
        System.out.println("Union set:" + unionSet);

        Set<Integer> intersectSet = task1.intersect(set1, set2);
        System.out.println("Intersect set:" + intersectSet);


    }
}
