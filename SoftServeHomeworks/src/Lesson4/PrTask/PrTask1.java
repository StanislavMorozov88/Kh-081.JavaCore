package Lesson4.PrTask;

import java.util.Scanner;

public class PrTask1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any 3 numbers");
        int count = 0;
        for (int i = 0; i < 3; i++){
            int num = scan.nextInt();
            if(num%2!=0){
                count++;
            }
        }
        scan.close();
        System.out.println("You have entered " +count + " odd numbers");

    }
}