package edu01.homework1;

/*
name + address
 */
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        System.out.println("What is your name ?");
        Scanner poop = new Scanner(System.in);
        String name = poop.nextLine();
        System.out.println("Where do you live" + " " + name + "?");
        String address = poop.nextLine();
        System.out.println(name + " " + address);


    }
}
