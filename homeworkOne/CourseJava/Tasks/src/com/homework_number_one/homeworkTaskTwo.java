package com.homework_number_one;

import java.util.Scanner;

public class homeworkTaskTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Where do you live, " + name);
        String address = scanner.nextLine();
        System.out.println("You live in " + address);

        scanner.close();
    }
}
