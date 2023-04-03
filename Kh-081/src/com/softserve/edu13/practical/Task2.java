package com.softserve.edu13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task2 {
  public static void main(String[] args) {
    // Get the current date
    LocalDate currentDate = LocalDate.now();

    // Get the first day of the current month
    LocalDate firstDayOfMonth = currentDate.withDayOfMonth(1);

    // Find the first Monday in the current month
    LocalDate firstMondayOfMonth = firstDayOfMonth;
    while (firstMondayOfMonth.getDayOfWeek() != DayOfWeek.MONDAY) {
      firstMondayOfMonth = firstMondayOfMonth.plusDays(1);
    }

    // Print the date of the first Monday
    System.out.println("The date of the first Monday in the current month is " + firstMondayOfMonth);
  }
}
