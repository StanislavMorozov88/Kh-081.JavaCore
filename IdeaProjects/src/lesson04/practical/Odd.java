package lesson04.practical;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Odd {
    private static final Scanner SC = new Scanner(System.in);

    public static void printOdd() {
        System.out.println("How many numbers would you like to check:");
        int count = readNumber();
        if (count <= 0) {
            System.out.println("Goodbye!");
            return;
        }
        int[] inputNumbers = inputFromConsole(count);
        System.out.println("Checking for odd values: ");
        outputResult(inputNumbers);
    }


    private static int[] inputFromConsole(int count) {
        int[] arr = new int[count];
        int index = 0;
        do {
            System.out.println("Enter " + (index + 1) + " number");
            arr[index++] = readNumber();
        } while (index < count);
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

    private static void outputResult(int[] arr) {
        int countOdd = 0;
        for (int j = 0; j < arr.length; j++) {
            if (Math.abs(arr[j]) % 2 == 1) {
                countOdd++;
                System.out.print(arr[j] + "  ");
            }
        }
        System.out.println();
        printCountOdd(countOdd);
    }

    private static void printCountOdd(int i) {
        if (i == 0) {
            System.out.println("There is no odd values");
        } else if (i == 1) {
            System.out.println("There is 1 odd value");
        } else System.out.println("There are " + i + " odd values");
    }

}
