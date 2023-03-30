package lesson11.hw;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 1)Create method div(), which calculates the dividing of two double numbers.
 * In main method input 2 double numbers and call this method.
 * Catch all exceptions.
 * 2)Write a method readNumber(int start, int end),
 * that read from console integer number and return it, if it is in the range [start...end].
 * If an invalid number or non-number text is read, the method should throw an exception.
 * Using this method write a method main(), that has to enter 10 numbers:
 * a1, a2, ..., a10, such that 1 < a1 < ... < a10 < 100
 * 3)Refactor your previous homework (1-7) and try to handle all possible exceptions in your code.
 */
public class Main {
    public static void main(String[] args) {
        //ex1
        System.out.println("Input 2 nums for dividing:");
        boolean c = false;
        while (!c) {
            try {
                Scanner sc = new Scanner(System.in);
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Result: " + div(a, b));
                c = true;
            } catch (InputMismatchException e) {
                System.err.println("Input the correct value (double number)");
            }
        }

        //ex2
        int[] arr = new int[10];
        try {
            arr[0] = readNumber(1, 100);
            for (int i = 1; i < 10; i++) {
                arr[i] = readNumber(arr[i - 1] + 1, 100);
            }
            System.out.println("Array of nums: ");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        } catch (InputMismatchException e) {
            System.err.println("Input correct number");
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static int readNumber(int start, int end) throws ArithmeticException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a num between " + start + " and " + end);
        int num = sc.nextInt();
        if (num >= start && num <= end) {
            return num;
        } else {
            throw new ArithmeticException("Dont in the range");
        }

    }
}
