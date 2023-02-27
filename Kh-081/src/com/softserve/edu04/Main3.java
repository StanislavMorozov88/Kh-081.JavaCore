package com.softserve.edu04;

public class Main3 {
    public static void main(String[] args) {
//        int a = 14, b = 7; // declare variables
//        double d = (double)a / b;
//        System.out.println("a + b = " + (a + b)); // addition operator
//        System.out.println("a - b = " + (a - b));// subtraction operator
//        System.out.println("a * b = " + (a * b));// multiplication operator
//        System.out.println(d);// division operator
//        System.out.println("a % b = " + (a % b));// modulus operator

//        int t = 5, s = 4, v = 7;
//        System.out.println(t > s && t > v || s < v);
//        System.out.println(t > s || t > v && s > v);
//        System.out.println((t > s || t > v) && s > v);

        int t = 5, s = 4;
        String str1 = (t > ++s) ? "yes" : "no";
        System.out.println(str1);

        //int f = (t >= ++s) ? 5 : 3;


        int a = 3, b = 2;
        String str2 = a-- == b ? "yes" : "no";
        System.out.println(str2);

        int x = 10, y = 0;

        if (x > 5) {
            y = 5;
        }
        y *= 5;
        System.out.println(y);


    }
}