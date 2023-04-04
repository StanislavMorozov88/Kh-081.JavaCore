package edu5.homework1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Task03 {
    static Scanner SCANNER;

    static {
        SCANNER = new Scanner(System.in);
    }

    public static void main(String[] args) {
        int[] array = new int[5];
        fillArrayFromConsole(array);
        printInfo(array);

    }

    private static void printInfo(int[] array) {
        System.out.println("Array" + Arrays.toString(array));
        int secondPositive = getSecondPositive(array);
        if(secondPositive > 0){
            System.out.println("second positive" + secondPositive + " position");
        }else {
            System.out.println("no or one positive in array");
        }
        int indexMin = getIndexMin(array);
        System.out.println(" minimal value " + array[indexMin] + " ,index" + indexMin);
        int productEven = calculateProductEven(array);
        if (productEven == 0) {
            System.out.println("There is no even number in the array.");
        } else {
            System.out.println("Product of all even number is: " + productEven);
        }
    }
    
    public static int getMinValue(int[] array) {
        return array[getMinIndex(array)];
    }

    private static int getMinIndex(int[] array) {
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
        return productEven == 1 ? 0 : productEven;

    }

    private static int getIndexMin(int[] array) {
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


    private static int getSecondPositive(int[] array) {
        int numberPositive = 0;
        int index = -1;
        while (++index < array.length){
            if(array[index] >= 0){
                countPositive++;
                if(countPositive == 2){
                    return index;
                }
            }
        }
        return -1;
    }


    private static void fillArrayFromConsole(int[] array) {
        for(int i = 0; i < array.length; i++){
            System.out.println("enter" + (i+1) + " number");
            array[i] = readNumber();
        }
    }
    private static int readNumber(){
        while(true){
            try{
                return SCANNER.nextInt();
            }
            catch (InputMismatchException e ){
                System.err.println("not int");
                SCANNER.nextLine();
            }
        }
    }

}
