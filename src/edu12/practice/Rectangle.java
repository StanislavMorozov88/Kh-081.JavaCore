package edu12.practice;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length = readInteger(scanner);

        System.out.print("Enter the width of the rectangle: ");
        int width = readInteger(scanner);

        try {
            int area = squareRectangle(length, width);
            System.out.println("The area of the rectangle is " + area);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    public static int squareRectangle(int a, int b) throws IllegalArgumentException {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Sides cannot be negative");
        }
        return a * b;
    }

    public static int readInteger(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println("Error: Please enter a valid integer");
            }
        }
    }
}