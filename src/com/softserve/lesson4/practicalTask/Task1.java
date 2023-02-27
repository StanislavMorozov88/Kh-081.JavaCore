package com.softserve.lesson4.practicalTask;

import java.util.Scanner;

/**
 * This program reads 3 numbers from console
 * and calculates how many of them are odd
 */
public class Task1 {

    /**
     * This method runs program, scans console for 3 numbers
     *      and then counts odds
     */
    public static void main(String[] args) {
        System.out.println("Enter 3 numbers: ");
        Scanner sc = new Scanner(System.in); //Creating scanner
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        sc.close(); // Closing scanner

        System.out.println(countOdd(firstNumber, secondNumber, thirdNumber));
    }

    /**
     * This method checks if number is odd
     * @param num is number it checks
     * @return 1 if it is odd or 0 if it is even
     */
    private static int checkOdd(int num) {
        return num % 2 == 0 ? 0 : 1;
    }

    /**
     * This method counts odds by adding result of checking
     *      by method checkOdd()
     * @param num1 is first number to check
     * @param num2 is second number to check
     * @param num3 is third number to check
     * @return amount of odd numbers
     */
    private static int countOdd(int num1, int num2, int num3) {
        return checkOdd(num1) + checkOdd(num2)
                + checkOdd(num3);
    }

}
