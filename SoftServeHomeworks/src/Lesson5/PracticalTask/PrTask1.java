package Lesson5.PracticalTask;

import java.util.Arrays;
import java.util.Random;

public class PrTask1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int i = 0;
        int max = 0;
        int sum = 0;
        int numOfNegativeNumbers = 0;
        int numOfPositiveNumbers = 0;
        Random r = new Random();
        while (i < 10) {
            array[i] = r.nextInt(-10, 10);
            i++;
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] >= max) {
                max = array[j];
            }
        }


        for (int j = 0; j < array.length; j++) {
            if (array[j] > 0) {
                sum += array[j];
            }
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] < 0) {
                numOfNegativeNumbers++;
            }
        }
            for (int j = 0; j < array.length; j++) {
                if (array[j] > 0) {
                    numOfPositiveNumbers++;
                }
            }
            if(numOfNegativeNumbers > numOfPositiveNumbers){
                System.out.println("Negative values more than positive in array");
            } else if (numOfNegativeNumbers < numOfPositiveNumbers) {
                System.out.println("Negative values less than positive in array");
            }
            else{
                System.out.println("Negative values are equal to positive values in array");
            }


        System.out.println("Our array is: " + Arrays.toString(array));
        System.out.println("The bigest value in our array is: " + max);
        System.out.println("The sum of positive values is: " + sum);
        System.out.println("The number of nefative values is: " + numOfNegativeNumbers);

        }
    }

