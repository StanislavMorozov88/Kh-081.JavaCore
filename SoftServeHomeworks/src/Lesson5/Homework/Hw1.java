package Lesson5.Homework;

import java.util.Arrays;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of month:");
        int sc = scan.nextInt();
        for (int i = 0; i < monthDays.length; i++) {
            if (sc == i + 1) {
                System.out.println("This month has " + monthDays[i] + " days");
            }

        }
    }}

