package com.softserve.lesson11.practicalTask;

import java.util.Scanner;

public class Practical2 {
    public static void main(String[] args) {
        System.out.println("Enter surname, name and patronymic: ");
        Scanner sc = new Scanner(System.in);
        String var = sc.nextLine();
        sc.close();
        String surName = var.substring(0, var.indexOf(' '));
        //System.out.println(surName + " sur");
        var = var.substring(var.indexOf(' ') + 1);
        //System.out.println(var + " var1");
        String name = var.substring(0, var.indexOf(' '));
        //System.out.println(name + " name");
        String patronymic = var.substring(var.indexOf(' ')+1);
        //System.out.println(patronymic + " patron");

        //Surnames and initials
        System.out.println(surName + " " + name.substring(0, 1) + "." + patronymic.substring(0,1) + ".");

        //Name
        System.out.println(name);

        //Name, middle name, surname
        System.out.println(name + " " + patronymic + " " + surName);
    }
}
