package com.homework_number_one;

import java.util.Scanner;

public class practicalTaskFour {
    public static void main(String[] args) {
        wow();
    }

    public static void wow() {
        System.out.println("How are you?");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        System.out.println("You are " + answer);
        scanner.close();
    }
}

