package com.softserve.edu06;

public class Test {
    public static void main(String[] args) {
        //casting
        int i = 100;
        long lg = i;
        float fl = lg;
        System.out.println("lg is " + lg);
        System.out.println("fl is " + fl);
        //downcasting
        double d = 100000000000.04;
        double k = 10.5;
        int a = (int) d;
        int b = (int) k;
        System.out.println("Downcasting d = 100000000000.04 to i = " + i);
        System.out.println("Downcasting k = 10.5 to b = " + b);
    }
}
