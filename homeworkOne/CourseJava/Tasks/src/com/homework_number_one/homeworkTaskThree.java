package com.homework_number_one;

import java.util.Scanner;

class homeworkTaskThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input your first country: ");
        String c1 = scanner.nextLine();
        System.out.println("Input a call duration: ");
        double t1 = scanner.nextDouble();
        scanner.nextLine();
        double oneMinCall = 3.5;
        double call1 = oneMinCall * t1;
        System.out.println("This phone call from " + c1 + " will cost you: " + call1);
        System.out.println("******");

        System.out.println("Input your second country: ");
        String c2 = scanner.nextLine();
        System.out.println("Input a call duration: ");
        double t2 = scanner.nextDouble();
        scanner.nextLine();
        double oneMinCall2 = 4;
        double call2 = oneMinCall2 * t2;
        System.out.println("This phone call from " + c2 + " will cost you: " + call2);
        System.out.println("**~~~~");

        System.out.println("Input your third country: ");
        String c3 = scanner.nextLine();
        System.out.println("Input a call duration: ");
        double t3 = scanner.nextDouble();
        scanner.nextLine();
        double oneMinCall3 = 6;
        double call3 = oneMinCall3 * t3;
        System.out.println("The phone call from " + c3 + " will cost you: " + call3);
        System.out.println("******");

        double total = call1 + call2 + call3;
        System.out.println("The total cost of all calls is: " + total + " \nThanks :)");

        scanner.close();
    }
}


