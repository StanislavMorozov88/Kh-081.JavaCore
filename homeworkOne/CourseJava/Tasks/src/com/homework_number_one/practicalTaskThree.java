package com.homework_number_one;

import java.util.Scanner;

public class practicalTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("a = ");
        double a = scanner.nextDouble();
        System.out.print("b = ");
        double b = scanner.nextDouble();

        double addition = a + b;
        System.out.println("The sum is " + addition);

        double substraction = a - b;
        System.out.println("The substraction is " + substraction);

        double multiplication = a * b;
        System.out.println("The multiplication is " + multiplication);

        double division = a / b;
        System.out.println("The division is " + division);
        scanner.close();
    }
}
