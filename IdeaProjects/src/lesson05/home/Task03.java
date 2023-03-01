package lesson05.home;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {
    static Scanner SC;

    static {
        SC = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        fillArrayFromConsole(array);
        printInfo(array);

    }

    public static int getSecondPositive(int[] array) {
        int countPositive = 0;
        int index = -1;
        while (++index < array.length) {
            if (array[index] >= 0) {
                countPositive++;
                if (countPositive == 2) {
                    return index;
                }
            }
        }
        return -1;
    }

    public static int getMinValue(int[] array) {
        return array[getMinIndex(array)];
    }

    private static int getMinIndex(int[] array) {
        int min = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }
        return index;
    }

    private static int calculateProductEven(int[] array) {
        int productEven = 1;
        for (int number : array) {
            if (number % 2 == 0) {
                if (number == 0) {
                    continue;
                }
                productEven *= number;
            }
        }
        return productEven == 1 ? 0 : productEven; //якщо немає парних, повертаєм 0 (метод нічого не рахував). Інакше - добуток парних.
    }

    //цей метод просто інформативний по результатах роботи.
    public static void printInfo(int[] array) {
        System.out.println("Array: " + Arrays.toString(array));
        int secondPositive = getSecondPositive(array);
        if (secondPositive > 0) {
            System.out.println("Second positive number is at " + secondPositive + " position.");
        } else {
            System.out.println("There is no or only one positive number in the array");
        }
        int indexMin = getMinIndex(array);
        System.out.println("Minimum value is: " + array[indexMin] + " ,index: " + indexMin);
        int productEven = calculateProductEven(array);
        if (productEven == 0) {
            System.out.println("There is no even number in the array.");
        } else {
            System.out.println("Product of all even number is: " + productEven);
        }
    }

    public static void fillArrayFromConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " integer number: ");
            array[i] = readNumber();
        }
    }

    private static int readNumber() {
        while (true) {
            try {
                return SC.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Not integer");
                SC.nextLine();
            }
        }
    }

}
