package Lesson4.Homework;

import java.util.Random;
import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Random r = new Random();

        int max = 0;
        int min = 0;
        for (int i = 0; i < 3; i++) {
            float f = r.nextFloat(-10, 10);
            if (-5 < f && f < 5) {
                System.out.println("The number" + f + " belong [-5;5]");
            } else System.out.println("The number" + f + " not belong [-5;5]");
        }
        for (int i = 0; i < 3; i++) {
            int a = r.nextInt();
            if (max <= a) {
                max = a;
            }

        }
        for (int i = 0; i < 3; i++) {
            int a = r.nextInt();
            if (min >= a) {
                min = a;
            }

        }
        System.out.println("Max = " + max + " Min = " + min);


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Please enter your error's number:");
        int numberOfError = scan.nextInt();
        if(numberOfError == 100 || numberOfError == 101 || numberOfError == 102){
            System.out.println(NumOfHttpError.INFOERROR);
        }
        else if(numberOfError == 200 || numberOfError == 201 || numberOfError == 202){
            System.out.println(NumOfHttpError.SUCCESS);
        }
        else if(numberOfError == 300 || numberOfError == 301 || numberOfError == 302){
            System.out.println(NumOfHttpError.REDIRECTION);
        }
        else if(numberOfError == 400 || numberOfError == 401 || numberOfError == 402){
            System.out.println(NumOfHttpError.CLIENTERROR);
        }
        else{
            System.out.println("Unknown error");
        }
    }
}
