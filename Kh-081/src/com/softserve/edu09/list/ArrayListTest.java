package com.softserve.edu09.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1-t element");
        list.add("2-d element");
        list.add("3-rd element");
        list.add("6-th element");
        list.add(0, "zero element");
        // list.add(8, "8-th element"); //error

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
            iterator.remove();
        }
        System.out.println(list);


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(2));
        //list.clear();
        System.out.println(list.isEmpty());
        list.remove(0);
        System.out.println(list);

        List<String> list2 = new ArrayList<>(list);
        list2.add("5-th element");
        System.out.println(list2);
    }

    public static <T> T getElement(ArrayList<T> list) {
        return list.get(1);

    }
}

