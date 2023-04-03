package com.softserve.edu12.task1;

import java.util.Scanner;

public class CalculatingSquareRectangle {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int a, b;
        
        System.out.print("Enter the length of the rectangle: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
        } else {
            System.out.println("Invalid input.");
            sc.close(); // закриваємо сканер перед поверненням
            return;
        }
        
        System.out.print("Enter the width of the rectangle: ");
        if (sc.hasNextInt()) {
            b = sc.nextInt();
        } else {
            System.out.println("Invalid input.");
            sc.close(); // закриваємо сканер перед поверненням
            return;
        }
        
        try {
            int area = squareRectangle(a, b);
            System.out.println("The area of the rectangle is " + area);
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        } finally {
            sc.close(); // закриваємо сканер в будь-якому випадку перед завершенням програми
        }
    }
    
    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Length and width must be non-negative.");
        }
        return a * b;
    }   
}