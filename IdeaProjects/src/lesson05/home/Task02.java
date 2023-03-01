package lesson05.home;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {
    static final Scanner SC;

    static {
        SC = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayFromConsole(array);
        System.out.println(Arrays.toString(array));
        System.out.println(calculateArray(array));
    }

    public static int calculateArray(int[] array) {
        int result = 0;
        if (isFirstFivePositive(array)) { //умова перших 5 позитивних(метод по перевірці окремо)
            for (int i = 0; i <= 4; i++) {
                result += array[i];
            }
            return result;
        } else {  //умова якщо перші 5 не всі позитивні, рахуєм добуток
            result = 1;
            boolean hasNonZero = false;
            for (int i = 5; i < array.length; i++) {
                if (array[i] == 0) {
                    continue;
                }
                hasNonZero = true;
                result *= array[i];
            }
            return hasNonZero ? result : 0; //нуль повернеться якщо останні 5 всі 0(метод нічого не рахував).
        }
    }

    public static boolean isFirstFivePositive(int[] array) {
        boolean isPositive = true;
        for (int i = 0; i <= 4; i++) {
            if (array[i] < 0) {
                return false;
            }
        }
        return isPositive;
    }

    private static void fillArrayFromConsole(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter " + (i + 1) + " number");
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
