package com.softserve.lesson5.homeTask;

import java.util.Arrays;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println("Position of second positive number is: " + findPOSPN(arr));
        findMin(arr);
        System.out.println("Product of all entered even numbers is: " + countProductOfEven(arr));

    }

    /**
     * This method finds position of second positive number in the array
     * @param arr is an array in which it is seeking
     * @return position of second positive number
     */
    private static int findPOSPN(int[] arr){
        int pos = 0;
        int count = 0;
        for (int j : arr) {
            if (j > 0) {
                count++;
            }
            if (count == 2) {
                pos = Arrays.binarySearch(arr, j);
                break;
            }
        }
        return pos;
    }

    /**
     * This method is seeking for min number in the array and it`s position
     * @param arr is an array in which it is seeking
     */
    private static void findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int j : arr){
            if (j < min){
                min = j;
            }
        }
        System.out.println("Minimum int is " + min + " and it`s position is "
                + Arrays.binarySearch(arr, min));
    }

    /**
     * This method calculates product of all even numbers in the array
     * @param arr is an array in which it is seeking
     * @return product of all even numbers in the array
     */
    private static int countProductOfEven(int[] arr){
        int product = 1;
        for(int j : arr){
            if(j % 2 == 0 && j != 0){
                product *= j;
            }
        }
        return product;
    }
}
