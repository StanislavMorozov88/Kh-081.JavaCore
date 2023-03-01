package lesson05.home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task01 {
    static Scanner SC;

    static {
        SC = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int[] monthsDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = readNumber();
        printRes(getDays(monthsDay, month));
    }

    public static void printRes(int n) {
        if (n == -1) {
            System.out.println(" not valid month ");
        } else System.out.println(n + " days.");
    }

    public static int getDays(int[] monthsDay, int month) {
        if (month >= 1 && month <= 12) {
            return monthsDay[month - 1];
        } else return -1;
    }

    private static int readNumber() {
        System.out.println("Enter number of month");
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Not a number");
                SC.nextLine();
            }
        }
    }
}
