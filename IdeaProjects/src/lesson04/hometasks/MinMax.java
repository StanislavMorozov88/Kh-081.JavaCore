package lesson04.hometasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MinMax {

    static class Point {
        private final int x;
        private final int y;

        public Point(int min, int max) {
            x = min;
            y = max;
        }
    }

    private static final Scanner SC = new Scanner(System.in);

    public static void printMinMax() {
        Point point = minMaxValue();
        System.out.println("Min value is: " + point.x + ", max value is: " + point.y);
    }

    private static Point minMaxValue() {
        int[] arr = inputFromConsole();
        int min = arr[0];
        int max = arr[0];
        for (int value : arr) {
            if (value < min) {
                min = value;
            }
            if (value > max) {
                max = value;
            }
        }
        return new Point(min, max);
    }

    private static int[] inputFromConsole() {
        int[] arr = new int[3];
        int index = 0;
        do {
            System.out.println("Enter " + (index + 1) + " number");
            arr[index++] = readNumber();
        } while (index < arr.length);
        return arr;
    }

    private static int readNumber() {
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("It's not a number");
                SC.nextLine();
            }
        }
    }
}
