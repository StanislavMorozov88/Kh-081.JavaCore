package lesson04.hometasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ranges {
    private static final Scanner SC = new Scanner(System.in);

    public static void rangeResult() {
        float[] arr = inputFromConsole();
        for (float number : arr) {
            if (Float.compare(number, -5) >= 0 && Float.compare(number, 5) <= 0) {
                System.out.println("Number " + number + " belongs to the range [-5, 5]");
            } else System.out.println("Number " + number + " is out of bound range [-5, 5]");
        }
    }

    private static float[] inputFromConsole() {
        float[] arr = new float[3];
        int index = 0;
        do {
            System.out.println("Enter " + (index + 1) + " number");
            arr[index++] = readNumber();
        } while (index < 3);
        return arr;
    }

    private static float readNumber() {
        while (true) {
            try {
                return SC.nextFloat();
            } catch (InputMismatchException e) {
                System.err.println("It's not a number");
                SC.nextLine();
            }
        }
    }
}
