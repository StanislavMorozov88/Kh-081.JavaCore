package edu13.practice;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MonTask {
    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        LocalDate firstOfMonth = currentDate.withDayOfMonth(1);
        DayOfWeek dayOfWeek = firstOfMonth.getDayOfWeek();
        int daysUntilMonday = DayOfWeek.MONDAY.getValue() - dayOfWeek.getValue();
        if (daysUntilMonday < 0) {
            daysUntilMonday += 7;
        }
        LocalDate firstMonday = firstOfMonth.plusDays(daysUntilMonday);
        System.out.println("The date of the first Monday for the current month is " + firstMonday);
    }
}
