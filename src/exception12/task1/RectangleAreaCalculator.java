package exception12.task1;
//Practical task 1
import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleAreaCalculator {
    private static final int MIN_LENGTH = 0;
    private static final int MIN_WIDTH = 0;

    public static void main(String[] args) {
        int length = getRectangleLength();
        int width = getRectangleWidth();

        try {
            int area = calculateRectangleArea(length, width);
            System.out.println("The area of the rectangle is " + area);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }

    private static int getRectangleLength() {
        Scanner scanner = new Scanner(System.in);
        int length = 0;

        while (true) {
            try {
                System.out.print("Enter the length of the rectangle: ");
                length = scanner.nextInt();

                if (length < MIN_LENGTH) {
                    System.out.println("Length must be non-negative.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Length must be an integer.");
                scanner.nextLine();
            }
        }
        return length;
    }

    private static int getRectangleWidth() {
        Scanner scanner = new Scanner(System.in);
        int width = 0;

        while (true) {
            try {
                System.out.print("Enter the width of the rectangle: ");
                width = scanner.nextInt();

                if (width < MIN_WIDTH) {
                    System.out.println("Width must be non-negative.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Width must be an integer.");
                scanner.nextLine();
            }
        }

        scanner.close();
        return width;
    }

    private static int calculateRectangleArea(int length, int width) {
        if (length < MIN_LENGTH || width < MIN_WIDTH) {
            throw new IllegalArgumentException("Length and width must be non-negative.");
        }
        return length * width;
    }
}
