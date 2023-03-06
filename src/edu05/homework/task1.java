package edu05.homework;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int [] daysOfMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the month number :");
        int month = scan.nextInt();
        scan.close();

        System.out.println("Input the month number: " + month);
        System.out.println("In this month are " + daysOfMonths[month-1] + " days");

    }
}
