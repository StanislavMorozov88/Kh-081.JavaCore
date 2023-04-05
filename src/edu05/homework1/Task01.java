package edu05.homework1;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Task01 {
    static Scanner S;

    static {
        S = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = readNumber();
        printResults(getDay(monthDays, month));
    }

    private static void printResults(int n){
        if (n == -1){
            System.out.println("not correct month!");
        }
        else System.out.println(n + " days");
    }

    private static int getDay(int[] monthDays, int month) {
        if (month >= 1 && month <= 12) {
            return monthDays[month - 1];
        } else {
            return -1;
        }
    }

    private static int readNumber() {
        System.out.println("Enter the month!");
        while (true) {
            try {
                return S.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("not a number!");
                S.nextLine();
            }
        }
    }
}