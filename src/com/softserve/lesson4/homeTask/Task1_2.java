package com.softserve.lesson4.homeTask;

import java.util.Scanner;

/**
 * This program reads 3 integer numbers and write max and min of them;
 */
public class Task1_2 {

    /**
     * This method runs program,
     *      I know that there is only one method,
     *      but idk what to say here
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Initializing scanner

        int[] number = new int[3];

        System.out.println("Input 3 numbers ");

        for(int i = 0; i < number.length; i++){
            number[i] = sc.nextInt();
        }

        sc.close(); //Closing scanner

        // Seeking for min and max
        int max = number[0];
        int min = number[0];
        for (int j : number) {
            if (max < j) max = j;
            if (min > j) min = j;
        }

        // Displaying result
        System.out.println("Max number is " + max);
        System.out.println("Min number is " + min);
    }
}
