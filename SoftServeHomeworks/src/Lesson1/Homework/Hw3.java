package Lesson1.Homework;

import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c1 = sc.nextInt();
        int c2 = sc.nextInt();
        int c3 = sc.nextInt();
        int t1 = sc.nextInt();
        int t2 = sc.nextInt();
        int t3 = sc.nextInt();
        int call1 = c1*t1;
        int call2 = c2*t2;
        int call3 = c3*t3;
        System.out.print(call1 + " ");
        System.out.print(call2 + " ");
        System.out.println(call3);
        System.out.println(call1 + call2 + call3);



    }
}
