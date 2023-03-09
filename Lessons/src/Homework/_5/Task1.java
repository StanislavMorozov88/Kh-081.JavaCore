package Homework._5;

import Experiments.ConsoleMenuWrap;

import java.util.Scanner;

public class Task1 {
    static final int[] Months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static String getEnd(int i) throws Exception{
        if (i<1){
            throw new Exception("number must be positive bigger than 0");
        }
        switch (i){
            case 1 ->{
                return "st";
            }
            case 2 ->{
                return "nd";
            }
            case 3 ->{
                return "rd";
            }
            default -> {
                return "th";
            }
        }
    }

    public static void main(String[] args) throws Exception {
        ConsoleMenuWrap page = new ConsoleMenuWrap();
        page.addLine("Please, enter the number of month:");
        page.show();
        page.clear();

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();
        if(number>12 || number<1){
            throw new Exception("Number must be between 1 and 12");
        }

        page.addLine("There are " + Months[number-1] + " days in the "+ number + getEnd(number) + " month." );
        page.show();

    }
}
