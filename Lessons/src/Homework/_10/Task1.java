package Homework._10;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {

        Set<Integer> set1 = new TreeSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        Set<Integer> set2 = new TreeSet<>();
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> setUnion= union(set1, set2);
        Set<Integer> setIntersect = intersect(set1, set2);

        System.out.println(setUnion);
        System.out.println(setIntersect);




    }

    public static <T> boolean isSameTypeOfSet(Set<T> set1, Set<T> set2){
        return set1.getClass().getSimpleName().equals(set2.getClass().getSimpleName());
    }

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        if (!isSameTypeOfSet(set1, set2)){
            //Лінь приводити їх до одного типу
            return null;
        }

        Set<T> set;
        if (set1 instanceof HashSet<T>) {
            if (set1 instanceof LinkedHashSet<T>) {
                set = new LinkedHashSet<>(set1);
            } else {
                set = new HashSet<>(set1);
            }
        } else {
            set = new TreeSet<>(set1);
        }
        set.addAll(set2);
        return set;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        if (!isSameTypeOfSet(set1, set2)){
            return null;
        }

        Set<T> set;
        if (set1 instanceof HashSet<T>) {
            if (set1 instanceof LinkedHashSet<T>) {
                set = new LinkedHashSet<>(set1);
            } else {
                set = new HashSet<>(set1);
            }
        } else {
            set = new TreeSet<>(set1);
        }

        set.clear();

        set1.forEach(o1 -> {
            set2.forEach(o2 -> {
                if (o1.equals(o2)) {
                    set.add(o1);
                }
            });
        });
        return set;
    }
}

/*
 * Write parameterized methods union(Set set1, Set set2)
 * and intersect(Set set1, Set set2), realizing the operations of union and intersection of two sets.
 * Test the operation of these techniques on two pre-filled sets.
 */