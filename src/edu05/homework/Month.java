package edu05.homework;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        //Ask user to enter the number of month.
        // Read the value and write the number of days in this month (create array with amount days of each month).
        Scanner sc = new Scanner(System.in);
        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        int userMonth = sc.nextInt();
        System.out.println("The number of the days in this month is: " + daysInMonth[userMonth]);
    }
}
