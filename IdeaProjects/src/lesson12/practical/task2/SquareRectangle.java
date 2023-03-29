package lesson12.practical.task2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SquareRectangle {
    public static int squareRectangle(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Length is negative");
        }
        return a * b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Input first side of Rectangle: ");
            int a = scanner.nextInt();
            System.out.println("Input second side of Rectangle: ");
            int b = scanner.nextInt();
            System.out.println("Square of Rectangle is: " + squareRectangle(a, b));
        } catch (InputMismatchException e) {
            System.err.println("Only integer values are allowed");
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
    }
}
