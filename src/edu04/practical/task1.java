package edu04.practical;


import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three numbers:");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        scan.close();

        int count = 0;

        if (a % 2 != 0){
            count++;
        } if (b % 2 != 0){
            count++;
        } if (c % 2 != 0){
            count++;
        }

        System.out.println("Odd numbers are " + count + " from 3");
    }
}
