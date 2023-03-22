package edu04.practice;

import java.util.Scanner;
//Enter three numbers. Find out how many of them are odd
public class Numbers {
    int[] array = new int[3];
    int count = 0;

    Scanner sc = new Scanner(System.in);
    int readNumber(){

        return 0;
    }
    void checkNum(){
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("Odd number is " + array[i]);
            }
        }
    }
}
