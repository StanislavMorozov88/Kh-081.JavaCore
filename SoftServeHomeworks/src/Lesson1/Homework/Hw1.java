package Lesson1.Homework;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double area = Math.PI * a * a;
        double per = 2* Math.PI * a;
        System.out.println("Area = " + area + "Perimeter = " + per);

    }
}
