package com.softserve.lesson13.practicalTask;

import java.time.*;

public class Practical1 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Get the day of the week
        DayOfWeek dayOfWeek = currentDate.getDayOfWeek();

        // Print the day of the week
        System.out.println("Today is " + dayOfWeek.toString().toLowerCase());
    }
}