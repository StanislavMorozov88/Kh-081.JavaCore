package edu12.homework;

import edu05.practical.Ex;

import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

public class task2 {
    public static void main(String[] args) {

    readNumber(1,10);
    System.out.println("------------------");
    mainInput();

    }

    public static void readNumber (int start, int end) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("Input integer number from [" + start + ";" + end + "]:");
            while (scan.hasNextInt()){
                int input = scan.nextInt();
                    if (input >= start && input <= end) {
                        System.out.println("Input = " + input);
                    } else {
                    throw new InputMismatchException("Input is wrong");
                }

            }
            scan.close();
            throw new InputMismatchException("Input is wrong");

        } catch (InputMismatchException exception) {
             exception.printStackTrace();
        }

    }

    public static void mainInput(){

        try {
            File input = new File("C:\\Users\\Professional\\Downloads\\test.txt");
            FileInputStream fis = new FileInputStream(input);
            Scanner scan = new Scanner(fis);
            while(scan.hasNextLine()){
                System.out.println(scan.nextLine());
            }
            scan.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error Reading File");
            e.printStackTrace();
        }
    }
}

