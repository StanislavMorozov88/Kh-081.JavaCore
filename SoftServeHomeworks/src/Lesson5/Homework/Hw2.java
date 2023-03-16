package Lesson5.Homework;

import java.util.Arrays;
import java.util.Random;

public class Hw2 {
    public static void main(String[] args) {
        Random r = new Random();
        int[] array = new int[10];
        int length = array.length;
        int a = 0;
        int sum = 0;
        int product = 1;

        while (a < array.length) {
            array[a] = r.nextInt(-5, 10);
            a++;
        }
        System.out.println(Arrays.toString(array));
        if (array[0] > 0 && array[1] > 0 && array[2] > 0 && array[3] > 0 && array[4] > 0) {
            for (int i = 0; i < array.length - 0.5 * array.length; i++) {
                sum += array[i];
            }
            System.out.println(sum);
        } else {
            for (int i = (int) (array.length - 0.5 * array.length); i < array.length; i++) {
                product *= array[i];
            }
            System.out.println(product);
        }
    }
}
