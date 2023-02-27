package com.softserve.lesson1.homeTask

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program asks radius of the circle and then calculates perimeter and area of the circle
 */
public class Homework1 {

    public static void main(String[] args) throws IOException {

        System.out.println("Input radius: "); //Asking radius

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Initializing reader
        int radius = Integer.parseInt(reader.readLine());
        reader.close(); //Closing reader
        System.out.println("Perimeter is " + (2 * Math.PI * radius) +
                "\nArea is " + (Math.PI * (Math.pow(radius, 2)))); //Printing result
    }
}
