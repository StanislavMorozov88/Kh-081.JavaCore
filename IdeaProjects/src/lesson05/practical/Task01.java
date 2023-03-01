package lesson05.practical;

import java.util.Arrays;

public class Task01 {
    public static void main(String[] args) {
        int[]array = {-8,5,3,0,-10,23,1,2,-1,3};

        printInfoArray(array);
    }

    public static void printInfoArray(int[]array){//це інформативний метод по результатах роботи.
        System.out.println("Array: " + Arrays.toString(array));
        System.out.println("Max value is: " + findMax(array));
        System.out.println("Sum all positive numbers: " + findSumPositive(array));
        System.out.println("Amount of negative numbers: " + amountNegative(array));
        printComparisonPositiveNegative(amountPositive(array),amountNegative(array));
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int value: array) {
            if (value>max){
                max = value;
            }
        }
        return max;
    }

    public static int findSumPositive(int[] array) {
        int sum = 0;
        for (int value: array) {
            if (value >=0){
                sum+=value;
            }
        }
        return sum;
    }

    public static int amountNegative(int[] array) {
        int amount = 0;
        for (int value: array) {
            if (value < 0){
                amount++;
            }
        }
        return amount;
    }

    public static int amountPositive(int[]array){
        return array.length - amountNegative(array);
    }

    private static void printComparisonPositiveNegative(int positive,int negative){
        if (positive > negative){
            System.out.println("There are more positive numbers in the array than negative ones");
        } else if (positive<negative){
            System.out.println("There are more negative numbers in the array than positive ones");
        }else System.out.println("The array has the same number of positive and negative numbers");
    }
}
