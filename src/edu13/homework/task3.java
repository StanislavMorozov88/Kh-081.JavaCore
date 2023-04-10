package edu13.homework;

import java.text.ParseException;
import java.time.LocalDate;

public class task3 {
    public static void main(String[] args) {

        LocalDate date1 = LocalDate.of(2020,12,18);
        int year1 = date1.getYear();
        System.out.println(year1 + " is leap: " + leapYear(date1));

        LocalDate date2 = LocalDate.of(2023,5,18);
        int year2 = date2.getYear();
        System.out.println(year2 + " is leap: " + leapYear(date2));
    }

    private static boolean leapYear(LocalDate date){
    int year = date.getYear();
    boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    return leap;
    }
}
