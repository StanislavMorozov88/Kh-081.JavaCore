package com.softserve.edu05;

import java.util.Arrays;

public class Exp1 {
    public static void main(String[] args) {

        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       // int[] monthDays2 = new int[12];
       //int [] array1 = new int [] {1,2,3};

        int[] monthDays3;//
        int n = 12;
        monthDays3 = new int[n];
        monthDays3[0] = 31;
        monthDays3[1] = 28;
        monthDays3[2] = 31;
        monthDays3[3] = 30;
        monthDays3[4] = 31;
        monthDays3[5] = 30;
        monthDays3[6] = 31;
        monthDays3[7] = 31;
        monthDays3[8] = 30;
        monthDays3[9] = 31;
        monthDays3[10] = 30;
        monthDays3[11] = 31;

        System.out.println(monthDays3.length);
        System.out.println(monthDays3);
        System.out.print(Arrays.toString(monthDays3) + " ");
        System.out.println();
        System.out.println(monthDays == monthDays3);
        System.out.println(Arrays.equals(monthDays, monthDays3));

        int elementWanted = 28;// можна перефарматувати під Scanner
        int result = linearSearch(monthDays, elementWanted);

        if (result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index " + result);
        }

        System.out.println("Index of 28 (number) in not sorted array "
                + binarySearch(monthDays,elementWanted));

        Arrays.sort(monthDays);
        System.out.println("Index of 28 (number) in sorted array "
                + binarySearch(monthDays,elementWanted));
    }

//Пошук елемента по масиву
    public static int linearSearch(int[] array, int elementWanted) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementWanted) {
                return i;
            }
        }
        return -1;
    }
    public static int binarySearch(int[] array, int elementWanted) {
        int firstIndex = 0;
        int lastIndex = array.length - 1;
        // умова припинення (елемент не представлений)
        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            // умова припинення (елемент не представлений)
            if (array[middleIndex] == elementWanted) {
                return middleIndex;
            }
            // коли центральний елемент у масиві менший
            // переводимо індекс у middle+1, не розглядаючи першу частину
            else if (array[middleIndex] < elementWanted) {
                firstIndex = middleIndex + 1;
            }
            // якщо центральний елемент більший
            // переводимо наш індекс у middle-1, не розглядаючи першу частину
            else if (array[middleIndex] > elementWanted) {
                lastIndex = middleIndex - 1;
            }
        }
        return -1;
    }
}