package lesson12.home;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Home01 {
    public static double div(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter divisible: ");
            double divisible = scanner.nextDouble();
            System.out.println("Enter divisor: ");
            double divisor = scanner.nextDouble();
            System.out.println("Division result is: " + div(divisible, divisor));
        } catch (ArithmeticException e) {
            System.err.println("Division by zero");
        } catch (InputMismatchException e) {
            System.err.println("Only double values are allowed");
        }
    }
}
