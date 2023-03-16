package Lesson5.Homework;

import java.util.Arrays;
import java.util.Random;

public class Hw3 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[5];
        int spn = 0;
        int a = 0;
        int min = 10;
        int productOfEvenNums = 1;
        while (a < array.length) {
            array[a] = r.nextInt(-10, 10);
            a++;
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[j] > 0) {
                        spn = j;
                        break;
                    }
                }
                break;
            }
        }
        if (spn == 0) {
            System.out.println("There is no second positive number");
        } else {
            System.out.println("Posotoin of second positive number = " + spn);
        }

        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println("Min = " + min);
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] != 0) {
                productOfEvenNums *= array[i];
            }
        }
        if (productOfEvenNums == 1) {
            System.out.println("There is no even numbers");
        } else {
            System.out.println("Product of even numbers = " + productOfEvenNums);
        }
    }
}
