package com.softserve.edu05;

public class Exp4 {
    public static void main(String[] args) {
        int[] arr = {2, -5, 7, -4, 8};

        int max = arr[0];
        int imax = 0;
        int i = 0;
        while (i < arr.length) {
            if (arr[i] > max) {
                max = arr[i];
                imax = i;
            }
            i++;
        }
        System.out.print("Maximum = " + max);
        System.out.println(" is in " + (imax + 1) + " place");

    }
}
