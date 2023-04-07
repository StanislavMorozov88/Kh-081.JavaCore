package com.softserve.lesson12.homeTask;

import java.util.Scanner;

public class Hw2 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(readNumber(1, 100));
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    private static int readNumber(int start, int end){
        int input = Integer.parseInt(sc.nextLine());
        if (input > end || input < start){
            throw new IllegalArgumentException("Input number is not in range");
        }
        return input;
    }

}
