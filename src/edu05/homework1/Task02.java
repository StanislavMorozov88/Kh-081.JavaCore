package edu05.homework1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;
public class Task02 {
    static final Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int[] array = new int[10];
        fillArrayFromConsole(array);
        System.out.println(Arrays.toString(array));
        System.out.println(calculateArray(array));
        
    }

    private static int calculateArray(int[] array) {
        int result = 0;
        boolean hasNoZero;
        if (firstFivePositive(array)) {
            for (int i = 0; i <= 4; i++) {
                result += array[i];
            }
            return result;
        } else {
            result = 1;
            hasNoZero = false;
            for (int i = 5; i < array.length; i++) {
                if (array[i] == 0) {
                    continue;
                }
            }
            hasNoZero = true;
            result *= array[result];
        }
        return hasNoZero ? 0 : result;
    }

    private static boolean firstFivePositive(int[] array) {
        boolean isPozitive = true;
        for(int i = 0; i <= 4; i++ ){
            if(array[i] < 0){
                return false;
            }
        }

        return isPozitive;
    }


    private static void fillArrayFromConsole(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println("enter" + (i+1) + "number");
            array[i] = readNumber();
            
        }
    }

    private static int readNumber() {
        while(true){
            try{
                return SCANNER.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("not int");
                SCANNER.nextLine();
            }

        }
    }

}
