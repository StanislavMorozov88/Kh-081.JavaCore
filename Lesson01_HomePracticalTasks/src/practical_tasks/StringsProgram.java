package practical_tasks;

import java.util.Arrays;
import java.util.Scanner;

public class StringsProgram {
    public static void main(String[] args) {
        System.out.println("Input text:");
        String[] arrayWords = readWordsFromConsole(3);
        System.out.println("Output text: ");
        printReverseResult(arrayWords);
    }

    private static void printReverseResult(String[]wordsArray) {
        for (int i = wordsArray.length-1; i >=0 ; i--) {
            System.out.println(wordsArray[i]);
        }
    }

    private static String[] readWordsFromConsole(int i) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsArray = new String[i];
        int index = 0;
        do {
            wordsArray[index++] = scanner.next();
        }while (index< wordsArray.length);
        return wordsArray;
    }
}
