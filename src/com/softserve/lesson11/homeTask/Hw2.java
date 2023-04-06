package com.softserve.lesson11.homeTask;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        System.out.print("Enter string: ");
        String str = enterSentence();
        str = String.join(" ", str.split("\\s+"));
        System.out.println(str);
    }

    private static String enterSentence(){
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        sc.close();
        return result;
    }

}
