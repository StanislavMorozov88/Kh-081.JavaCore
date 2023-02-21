package com.homework_number_one;

import java.util.Scanner;

public class practicalTaskTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double nmb1 = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double nmb2 = scanner.nextDouble();
        System.out.println("Enter your third number: ");
        double nmb3 = scanner.nextDouble();
        double averageNumber = (nmb1 + nmb2 + nmb3) / 3;

        System.out.println("The average of your 3 numbers is " + averageNumber);
        scanner.close();
    }
}
