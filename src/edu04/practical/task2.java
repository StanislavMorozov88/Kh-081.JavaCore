package edu04.practical;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7: ");
        int input = scan.nextInt();
        scan.close();
        switch (input){
            case 1 -> System.out.println(Days.Mon.getUa() + " " + Days.Mon.getEn());
            case 2 -> System.out.println(Days.Tue.getUa() + " " + Days.Tue.getEn());
            case 3 -> System.out.println(Days.Wed.getUa() + " " + Days.Wed.getEn());
            case 4 -> System.out.println(Days.Thu.getUa() + " " + Days.Thu.getEn());
            case 5 -> System.out.println(Days.Fri.getUa() + " " + Days.Fri.getEn());
            case 6 -> System.out.println(Days.Sat.getUa() + " " + Days.Sat.getEn());
            case 7 -> System.out.println(Days.Sun.getUa() + " " + Days.Sun.getEn());
            default -> System.out.println("The wrong input");
        }

    }
}
