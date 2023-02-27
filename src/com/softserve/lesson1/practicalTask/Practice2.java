package com.softserve.lesson1.practicalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program takes 3 numbers and then calculates their average
 */
public class Practice2 {
    private static final int NUMNUMBER = 3;

    public static void main(String[] args) throws IOException {
        int a = 0, b = 0, c = 0; // Initializing vars

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Initializing BufferedReader

        /* Loop to ask numbers */
        for (int i = 0; i < NUMNUMBER; i++) {

            /* Switch to save different values into vars */
            switch (i) {
                case (0) -> {
                    System.out.println("Input " + (i + 1) + " number: ");
                    a = Integer.parseInt(reader.readLine());
                }
                case (1) -> {
                    System.out.println("Input " + (i + 1) + " number: ");
                    b = Integer.parseInt(reader.readLine());
                }
                case (2) -> {
                    System.out.println("Input " + (i + 1) + " number: ");
                    c = Integer.parseInt(reader.readLine());
                }
            }
        }
        reader.close(); // Closing reader
        System.out.println("Average is " + ((double) (a + b + c) / 3)); // Printing result
    }
}
