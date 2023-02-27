package com.softserve.lesson4.practicalTask;

import java.util.Scanner;

/**
 * This program asks user to input number of the weekday
 *      and then displays name of the day in two languages
 */
public class Task2 {

    /**
     * This method runs program asks input and display output
     */
    public static void main(String[] args) {
        System.out.println("Enter number of the day: ");
        Scanner sc = new Scanner(System.in); //Creating scanner
        int dayOfWeek = sc.nextInt();
        sc.close(); // Closing scanner
        displayName(dayOfWeek);
    }

    /**
     * This method decide which day display
     * @param day weekday number
     *            first is Sunday and last is Saturday
     */
    private static void displayName(int day){
        switch (day) {
            case 1 -> System.out.println("Sunday\nНеділя");
            case 2 -> System.out.println("Monday\nПонеділок");
            case 3 -> System.out.println("Tuesday\nВівторок");
            case 4 -> System.out.println("Wednesday\nСереда");
            case 5 -> System.out.println("Thursday\nЧетвер");
            case 6 -> System.out.println("Friday\nП'ятниця");
            case 7 -> System.out.println("Saturday\nСубота");
            default -> System.out.println("Wrong input, probably you entered string\n" +
                    "Or you just don`t know there are only 7 days in the week");
        }
    }

}
