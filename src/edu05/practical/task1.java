package edu05.practical;

import java.util.Arrays;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        int[] array =  new int[10];
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            array[i] = random.nextInt(-10, 10);
        }
        System.out.println(Arrays.toString(array));

        int max = array[0];
        for(int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("The biggest of these numbers = " + max);

        int sum = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] > 0){
                sum += array[i];
            }
        }
        System.out.println("The sum of positive numbers in the array = " + sum);

        int amountOfNegative = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) { amountOfNegative++; }
        }
        System.out.println("The amount of negative numbers in the array  = " + amountOfNegative);

        int amountOfPositive = 0;
        for (int i = 0; i < array.length; i++){
            if(array[i] > 0){
                amountOfPositive++;
            }
        }
        System.out.println("The amount of positive numbers in the array  = " + amountOfPositive);

        if(amountOfPositive > amountOfNegative){
            System.out.println("Positive values are more than negative");
        } else if(amountOfPositive < amountOfNegative){
            System.out.println("Negative values are more than positive");
        } else {
            System.out.println("Negative and positive values are equally");
        }

    }
}
