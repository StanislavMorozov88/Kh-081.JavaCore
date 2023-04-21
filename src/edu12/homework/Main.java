package edu12.homework;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            double result = div(readDouble(scanner), readDouble(scanner));
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            try {
                numbers[i] = readNumber(scanner, 1, 100);
                if (i > 0 && numbers[i] <= numbers[i-1]) {
                    throw new IllegalArgumentException("Number must be greater than previous number.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                i--;
            }
        }
        System.out.println("Numbers:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }

    public static double div(double a, double b) throws Exception {
        if (b == 0) {
            throw new Exception("Cannot divide by zero");
        }
        return a / b;
    }

    public static int readNumber(Scanner scanner, int start, int end) throws Exception {
        System.out.printf("Enter a number between %d and %d: ", start, end);
        try {
            int number = scanner.nextInt();
            if (number < start || number > end) {
                throw new IllegalArgumentException("Number is not within the range.");
            }
            return number;
        } catch (InputMismatchException e) {
            throw new Exception("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.nextLine();
        }
    }

    public static double readDouble(Scanner scanner) throws Exception {
        System.out.print("Enter a number: ");
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            throw new Exception("Invalid input. Please enter a valid double.");
        } finally {
            scanner.nextLine();
        }
    }
}
