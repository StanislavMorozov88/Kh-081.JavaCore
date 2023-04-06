package com.softserve.lesson11.practicalTask;

import java.util.Scanner;

public class Practical1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 Strings: ");
        String firstString = sc.nextLine();
        String secondString = sc.nextLine();
        sc.close();
        System.out.println(checkSubString(firstString, secondString));
    }

    private static boolean checkSubString(String s1, String s2){
        String subString = s2.substring(0, s1.length());
        return s1.equals(subString);
    }
}
