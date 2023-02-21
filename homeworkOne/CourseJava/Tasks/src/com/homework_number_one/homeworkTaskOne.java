package com.homework_number_one;

import java.util.Scanner;

public class homeworkTaskOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the radius of flowerbed: ");
        int radius = scanner.nextInt();

        double perimeter = Math.PI * (2 * radius);
        System.out.println("The perimeter is " + perimeter);
        System.out.print("The rounded variant of perimeter is ");
        System.out.println(Math.round(perimeter));

        double area = Math.PI * Math.pow(radius, 2);
        System.out.println(" ");
        System.out.println("The area is " + area);
        System.out.print("The rounded variant of area is ");
        System.out.println(Math.round(area));

        scanner.close();
    }
}
