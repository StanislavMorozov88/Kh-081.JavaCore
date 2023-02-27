package com.softserve.lesson1.practicalTask

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program makes different calculations with two input numbers
 */
public class Practice3 {

    public static void main(String[] args) throws IOException {
        int a, b; // Initializing vars
        System.out.println("Input 1 number, press Enter and input 2 number: ");

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Initializing reader
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        reader.close(); // Closing reader;

        /* Printing result */
        System.out.println("Sum is: " + (a + b));
        System.out.println("Diff is: " + (a - b));
        System.out.println("Prod is: " + (a * b));
        System.out.println("Div is: " + (a / b));

    }
}
