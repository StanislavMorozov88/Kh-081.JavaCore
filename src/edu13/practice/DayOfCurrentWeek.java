package edu13.practice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DayOfCurrentWeek {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        String dayOfWeek = today.format(DateTimeFormatter.ofPattern("EEEE"));
        System.out.println("Today is " + dayOfWeek);
    }
}
