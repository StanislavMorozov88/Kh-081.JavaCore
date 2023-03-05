package com.softserve.lesson5.homeTask;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 10 integers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        if(checkFirstFive(arr)){
            System.out.println("Sum of first 5 ints is: " + calculateFirstFiveSum(arr));
        } else{
            System.out.println("Product of last 5 ints is: " + calculateLastFiveProduct(arr));
        }
    }

    /**
     * This method checks if first 5 numbers are positive
     * @param arr is an array in which it is checking
     * @return true if they are positive or false if there is at least one negative
     */
    private static boolean checkFirstFive(int[] arr) {
        boolean firstFivePositive = false;
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] < 0) {
                firstFivePositive = false;
                break;
            } else {
                firstFivePositive = true;
            }
        }
        return firstFivePositive;
    }

    /**
     * This method calculates sum of the first 5 numbers in the array
     * @param arr is an array in which it is calculating
     * @return sum of the first 5 numbers in the array
     */
    private static int calculateFirstFiveSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * This method calculates product of 5 last numbers in the array
     * @param arr is an array in which it is calculating
     * @return product of 5 last numbers in the array
     */
    private static int calculateLastFiveProduct(int[] arr) {
        int product = 1;
        for (int i = 5; i < arr.length; i++) {
            if (arr[i] != 0) {
                product *= arr[i];
            }
        }
        return product;
    }
}
