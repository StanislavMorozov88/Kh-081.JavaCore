package edu05.homework;

import java.util.Scanner;

public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];

        //Fill the array using System.in
        for(int i = 0; i < array.length; i++){
            array[i] = sc.nextInt();
        }

        //Fill the array with random integers
        /*int minNumberInArray = -15;
        int maxNumberInArray = 15;
        int range = maxNumberInArray - minNumberInArray + 1;
        for(int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random() * range) + minNumberInArray;
            System.out.println(array[i]);
        }*/
        //Calculation part
        //check the first 5 numbers for condition
        int production = array[0];
        int sum = 0;
        if(!arePositive(array)){
            for(int i = 5; i < array.length; i++){
                production = array[i] * production;
            }
            System.out.println("The production of last 5 numbers are: " + production);
        }else{
            for (int i = 0; i < 5; i++) {
                sum += array[i];
            }
            System.out.println("The sum of the first 5 number are: " + sum);
        }
    }
    static boolean arePositive(int[] array){
        for(int i = 0; i < 5; i++){
            if(array[i] < 0) return false;
        }
        return true;
    }

}
