package com.softserve.edu10.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, Student> studentMap = new HashMap<>();

        Student st1 = new Student("Anna","Anna",1);
        Student st2 = new Student("Olena","Olena",1);
        Student st3 = new Student("Pavlo","Pavlo",2);
        Student st4 = new Student("Yaroslav","Yaroslav",3);

        studentMap.put(1,st1);
        studentMap.put(2,st1);
        studentMap.put(3,st1);
        studentMap.put(4,st1);
      //  System.out.println(studentMap);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Olena");
        map.put(2, "Daria");
        map.put(3, "Ihor");
        map.put(4, "Andriy");
        map.put(5, "Nikita");
        map.put(1, "Pavlo");
        map.put(null, "Olena");
        map.put(6, null);
        map.put(7, "Olena");
        map.remove(7);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
//        System.out.println(map);

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
