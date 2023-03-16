package com.softserve.edu09;

public class Test1 {
    public static void main(String[] args) {

        Info<String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info<Integer> info2 = new Info<>(10);
        Integer i = info2.getValue();
        System.out.println(info2);
    }
}
