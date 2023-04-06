package com.softserve.lesson11.homeTask;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        String str = enterString();

        String pattern = "\\$\\d+\\.\\d{2}";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(str);

        while (m.find()){
            int start = m.start();
            int end = m.end();
            System.out.println(str.substring(start, end));
        }
    }

    //$20000.00 abracadabra, $3, $20.99, $20.9, $.99 abracadabra
    private static String enterString(){
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        sc.close();
        return result;
    }
}
