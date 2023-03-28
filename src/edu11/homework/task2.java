package edu11.homework;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence that contains the words between more than one space.");
        String input = scan.nextLine();
        scan.close();
        System.out.println("Input: " + input);

        String replace = input.replaceAll("[\\s]{2,}", "\s");
        System.out.println("Replace: " + replace);


    }
}
