package edu01.homework2;

/*
phone calls
 */

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How much does a minute from each contry costs?");
        int c1 = scanner.nextInt();
        int c2 = scanner.nextInt();
        int c3 = scanner.nextInt();
        System.out.println("How much time do the calls lasted?");
        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();
        int call1 = c1 * t1; int call2 = c2 * t2; int call3 = c3 * t3; int EveryCall = call1 + call2 + call3;
        System.out.println(call1 + " " + call2 + " " + call3 + " " + EveryCall);
    }
}
