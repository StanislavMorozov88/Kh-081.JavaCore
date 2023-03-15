package edu01.homework;

/*
Flowerbed
 */

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int radius = scanner1.nextInt();
        double pi = 3.14;
        double perimetr = 2 * radius * pi;
        double area = radius * radius * pi;
        System.out.println(perimetr);
        System.out.println(area);

    }
}
