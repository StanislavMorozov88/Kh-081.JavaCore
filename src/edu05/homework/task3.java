package edu05.homework;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 5 integer numbers: ");
        int[] arr = new int[5];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }
        scan.close();
        System.out.println(Arrays.toString(arr));

        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));

        /*int index = 0;
       for (int i = 0; i < arr.length; i++){
           if(arr[i] > 0){
               index = i;
               break;
           }
       }*/

        int index = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                index = i;
                count++;
            } if(count == 1) break;
        }

       //Position is an index in the array, not a regular place.
       System.out.println("Position of second positive number = " + (index+1));
       System.out.println("Second positive number = " + arr[index+1]);

       int min = arr[0];
       int imin = 0;
       int i = 0;
       while (i < arr.length){
           if(arr[i] < min){
               min = arr[i];
               imin = i;
           }
           i++;
       }
        System.out.println();
        System.out.println("Minimum = " + min);
        //Position is an index in the array, not a regular place.
        System.out.println("Position minimum in the array = " + imin);

        int product = 1;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] % 2 == 0) {
                product = product * arr[j];}
        }
        System.out.println();
        System.out.println("Product  of all entered even numbers = " + product);

    }
}
