package Lesson13.PracticalTasks;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class PrTask1And2 {
    public static void dayOfAWeek (){
        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.ENGLISH));
    }
    public static void firstMonday(){
        LocalDate today = LocalDate.now();
        System.out.println("First Monday was; " + today.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
    }

    public static void main(String[] args) {
        dayOfAWeek();
        firstMonday();
    }

}
