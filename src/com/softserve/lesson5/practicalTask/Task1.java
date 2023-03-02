package com.softserve.lesson5.practicalTask;



public class Task1 {

    private static final int[] ARR = {1, -1, 2, -2, 3, -3, 4, -4, 5, -5};

    public static void main(String[] args) {
        System.out.println("The biggest number is: " + findBiggest(ARR));
        System.out.println("Sum of positive numbers is: " + calculatePositiveSum(ARR));
        System.out.println("Amount of negative numbers is: " + calculateAmountOfNegative(ARR));
        System.out.println(calculateWhichIsMore(ARR));
    }

    private static int findBiggest(int[] arr){
        int max = arr[0];
        for (int j : arr) {
            if (j > max) {
                max = j;
            }
        }

        return max;
    }

    private static int calculatePositiveSum(int[] arr){
        int sum = 0;
        for(int j : arr) {
            if (j > 0) {
                sum += j;
            }
        }
        return sum;
    }

    private static int calculateAmountOfNegative(int[] arr) {
        int amount = 0;
        for (int j : arr) {
            if (j < 0) {
                amount++;
            }
        }
        return amount;
    }

    private static String calculateWhichIsMore(int[] arr) {

        String str = "";
        if ((arr.length - calculateAmountOfNegative(arr)) > arr.length / 2) {
            str = "There are more positive";
        } else if ((arr.length - calculateAmountOfNegative(arr)) < arr.length / 2){
            str = "There are more negative";
        } else {
            str = "The number is equal";
        }

        return str;
    }
}
