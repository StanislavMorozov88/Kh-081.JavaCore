package com.softserve.edu05;

import java.util.Arrays;

public class Exp2 {
    public static void main(String[] args) {
        int[][] twoD = new int[4][];
        twoD[0] = new int[]{1, 2, 3, 4, 5};
        twoD[1] = new int[]{6, 7};
        twoD[2] = new int[]{8, 9, 10};
        twoD[3] = new int[]{11, 12, 13, 14, 15, 16, 17};


        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.print(twoD[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(twoD[2][2]);
        // System.out.println(twoD[0][6]);//Exception "Index 6 out of bounds for length 5"
    }
 }
