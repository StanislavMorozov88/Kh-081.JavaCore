package Lesson10;

import java.util.*;


public class Hw1 {


//        public Set<Type> union (Set<T> set1 , Set<T> set2){
//            Set<T> set3 = set1.addAll(set2);
//
//        }
     public static <T> List<T> union(Set<T> set1, Set<T> set2){ // я загуглив як зробити цей метод, але не можу знайти навіщо тут <T>
         List<T> set3 = new ArrayList();
         set3.addAll(set1);
         set3.addAll(set2);
         return set3;
     }
     public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
         Set<T> set3 = new HashSet<>();
         set3.addAll(set1);
         set3.addAll(set2);
         return set3;

     }


    public static void main(String[] args) {

        Set<Integer> first = new HashSet<>();
        first.add(1);
        first.add(2);
        first.add(3);
        first.add(4);
        first.add(5);
        first.add(6);
        first.add(7);
        first.add(8);
        first.add(9);
        first.add(0);
        first.add(11);

        Set<Integer> second = new HashSet<>();
        second.add(1);
        second.add(11);
        second.add(3);
        second.add(4);
        second.add(5);
        second.add(0);
        second.add(111);
        second.add(2);
        System.out.println("Union: " + Hw1.union( first,second));
        System.out.println("Intersection: " + Hw1.intersect(first,second));
    }
}

