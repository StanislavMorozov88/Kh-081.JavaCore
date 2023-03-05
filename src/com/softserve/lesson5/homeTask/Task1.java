package com.softserve.lesson5.homeTask;

import java.util.Scanner;

/**
 * This program asks user number of month and then returns number of days in it
 */
public class Task1 {
    public static void main(String[] args) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        System.out.print("Enter month number: ");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        while (input != 13){
            System.out.println(months[input - 1]);
            System.out.print("Enter next month  number or 13 if you want to close program: ");
            input = sc.nextInt();
        }
        sc.close();
    }
}
