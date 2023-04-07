package com.softserve.lesson12.homeTask;

import java.util.Scanner;

public class Hw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two doubles: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        try{
            System.out.println(div(a, b));
        } catch (IllegalArgumentException e){
            System.err.println(e.getMessage());
        }
    }

    private static double div(double a, double b) {
        if(b == 0) {
            throw new IllegalArgumentException("Second number is zero");
        }
        return a / b;
    }
}
