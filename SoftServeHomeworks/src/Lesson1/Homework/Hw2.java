package Lesson1.Homework;

import java.util.Scanner;

public class Hw2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String a1 = sc.nextLine();
        System.out.println("Where are you live, " + "a1" + "?");
        String a2 = sc.nextLine();
        System.out.println("Your name is " + a1  + ", You live in " + a2);

    }
}
