package com.softserve.edu07;

import java.util.*;

public class SortingArray {
    public static void main(String[] args) {
        int[] x = new int[10];
        Random rand = new Random();
        for (int i = 0; i < x.length; i++) {
            x[i] = rand.nextInt(10);
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+ " ");
        }
        System.out.println();
        Arrays.sort(x);
        System.out.print(Arrays.toString(x)+ " ");

    }

}
