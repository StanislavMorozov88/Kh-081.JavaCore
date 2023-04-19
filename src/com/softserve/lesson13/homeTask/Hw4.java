package com.softserve.lesson13.homeTask;

import java.time.LocalDate;

public class Hw4 {
    public static void main(String[] args) {
        LocalDate localDateBirth = LocalDate.of(2001, 01,25);
        dayOfTheWeek(localDateBirth);
    }

    public static void dayOfTheWeek(LocalDate date){
        System.out.println("Day of tour birthday was: " + date.getDayOfWeek());
        System.out.println("Day of tour birthday after 6 month was: " + date.plusMonths(6).getDayOfWeek());
        System.out.println("Day of tour birthday after 12 month was: " + date.plusMonths(12).getDayOfWeek());
    }
}
