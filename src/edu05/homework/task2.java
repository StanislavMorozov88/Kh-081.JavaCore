package edu05.homework;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(Arrays.toString(numbers));

        int sum = 0;
        int product = 1;

        for (int i = 0; i < 5; i++){
            if (numbers[i] >= 0){
                sum += numbers[i];
            } else if (numbers[i] < 0) {
                for (i = 5; i < 10; i++){
                    product = product * numbers[i];
                }
            }
        }

        //Оля, як можна оптимізувати 31-ий рядок, з умововю if?
        if(numbers[0] >= 0 & numbers[1] >= 0 & numbers[2] >= 0 & numbers[3] >= 0 & numbers[4] >= 0){
            System.out.println("Sum = " + sum);
        } else {
            System.out.println("Product = " + product);
        }

    }
}
