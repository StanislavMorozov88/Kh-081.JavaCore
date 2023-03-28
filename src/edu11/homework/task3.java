package edu11.homework;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the text from the console that contains several\n" +
                "occurrences of US currency.");
        String input = scan.nextLine();
        scan.close();
        System.out.println("Input: " + input);

        Pattern currencyUS = Pattern.compile("(\\$)(\\d+)(\\.)(\\d{2})");
        Matcher matcher = currencyUS.matcher(input);
        System.out.println("All occurrences:");
        while (matcher.find())
            System.out.println(matcher.group());


    }
}
