package com.softserve.lesson1.practicalTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * This program asks 3 lines and then print them in the reverse order
 */
public class Practice1 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // Initializing reader

        System.out.println("Enter first line: ");
        String str1 = reader.readLine();
        System.out.println("Enter second line: ");
        String str2 = reader.readLine();
        System.out.println("Enter third line: ");
        String str3 = reader.readLine();
        System.out.println(str3);
        System.out.println(str2);
        System.out.println(str1);
        reader.close(); // Closing reader
    }
}