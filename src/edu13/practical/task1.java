package edu13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class task1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DayOfWeek today = date.getDayOfWeek();
        System.out.println("Today is " + today);
        System.out.println(date);


    }
}
