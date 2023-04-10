package edu13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class task2 {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        TemporalAdjuster firstMonInMonth =
                TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY);

        System.out.println(today.with(firstMonInMonth));
    }
}
