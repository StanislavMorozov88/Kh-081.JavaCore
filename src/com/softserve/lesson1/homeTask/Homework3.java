package com.softserve.lesson1.homeTask

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program asks you about cost per minute and time of 3 calls, then calculates each cost and cost of all calls together
 */
public class Homework3 {

    private static final int CALLNUMBERS = 3; //Const with number of calls to avoid magic numbers

    /* Main method that runs program */
    public static void main(String[] args) throws IOException {
        int c1 = 0, c2 = 0, c3 = 0, t1 = 0, t2 = 0, t3 = 0; //Initializing vars
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Initializing reader
        /* Loop to ask about different calls */
        for (int i = 0; i < CALLNUMBERS; i++) {
            /* Switch statement to save values to different vars */
            switch (i) {
                case (0) -> { //case for first call
                    System.out.println("Enter " + (i + 1) + " call cost");
                    c1 = Integer.parseInt(reader.readLine());
                    System.out.println("Enter " + (i + 1) + " call time");
                    t1 = Integer.parseInt(reader.readLine());
                }
                case (1) -> { //case for second call
                    System.out.println("Enter " + (i + 1) + " call cost");
                    c2 = Integer.parseInt(reader.readLine());
                    System.out.println("Enter " + (i + 1) + " call time");
                    t2 = Integer.parseInt(reader.readLine());
                }
                case (2) -> { //case for third call
                    System.out.println("Enter " + (i + 1) + " call cost");
                    c3 = Integer.parseInt(reader.readLine());
                    System.out.println("Enter " + (i + 1) + " call time");
                    t3 = Integer.parseInt(reader.readLine());
                }
            }
        }
        reader.close(); //Closing reader
        System.out.println("Cost of each call: \n   First: " + (c1 * t1) + //Printing each call cost separate
                "\n    Second: " + (c2 * t2) + "\n     Third: " + (c3 * t3));
        System.out.println("Total cost is: " + ((c1 * t1) + (c2 * t2) + (c3 * t3))); //Printing all calls cost together
    }
}
