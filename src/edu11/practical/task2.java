package edu11.practical;

import java.util.Scanner;
import java.util.regex.*;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter surname, name and patronymic.");
        String input = scan.nextLine();
        scan.close();
        System.out.println("Inputted: " + input);

        Pattern p = Pattern.compile("[ ]");
        String[] str = p.split(input);

        String lastName = str[0];
        String name = str[1];
        String middleName = str[2];

        char n = name.charAt(0);
        char m = middleName.charAt(0);

        System.out.println("surname and initials: " + lastName + " " + n + " " + m);
        System.out.println("name: " + name);
        System.out.println("name, middle name and last name: " + name + " " + middleName + " " + lastName);

    }
}
