package edu11.practice;
import java.util.Scanner;
import java.util.regex.Pattern;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //t1
        System.out.print("String one: ");
        String str1 = scanner.nextLine();
        System.out.print("String two: ");
        String str2 = scanner.nextLine();
        boolean isSubstring = str1.contains(str2);
        System.out.println("is part of? ->  " + isSubstring);

        //t2
        System.out.print("Enter surname: ");
        String surname = scanner.nextLine();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter patronymic: ");
        String patronymic = scanner.nextLine();
        String initials = surname + " " + name.charAt(0) + ".";
        System.out.println("Surnames and initials: " + initials);
        System.out.println("Name: " + name);
        System.out.println("Name, middle name and last name: " + name + " " + patronymic + " " + surname);

        //t3
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_]{3,15}$");
        String[] names = {"John_Doe123", "Jane.Doe", "jdoe", "J0hn_Doe_123", "nonameuser"};
        for (String nameToCheck : names) {
            boolean isValid = pattern.matcher(nameToCheck).matches();
            System.out.println(nameToCheck + " is valid? " + isValid);
        }
    }
}