package com.softserve.lesson4.homeTask;

import java.util.Scanner;

/**
 * This program asks user 3 floats, checks are they all belong
 *      to the range [-5, 5], and prints result
 */
public class Task1_1 {
    /**
     * Program starts from this method
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Initializing scanner

        float[] number = new float[3];

        System.out.println("Input 3 numbers");

        for(int i = 0; i < number.length; i++){
            number[i] = sc.nextFloat();
        }

        sc.close(); //Closing scanner

        if(checkRange(number) == 3){
            System.out.println("All numbers belong to the range [-5, 5]");
        } else{
            System.out.println("Amount of numbers that belong to the range [-5, 5] is: " + checkRange(number));
        }

    }

    /**
     * This method checks numbers range and returns amount of numbers
     *      that belong  to the range [-5, 5]
     * @param num array with float numbers it checks
     * @return int value with amount of numbers
     *      that belong  to the range [-5, 5]
     */
    private static int checkRange(float[] num ){
        int amount = 0;
        for(float i : num){
            if (i <= -5 || i >= 5) amount++;
        }
        return amount;
    }
}
