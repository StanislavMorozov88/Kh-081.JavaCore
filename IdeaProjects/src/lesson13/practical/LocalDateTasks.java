package lesson13.practical;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class LocalDateTasks {
    static LocalDate now = LocalDate.now();

    public static void showTodayDay() {
        String today = now.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
        System.out.println("Today is " + today);
    }

    public static void showFirstMondayCurrent() {
        LocalDate firstMonday = now.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        System.out.println("First Monday of " + now.getMonth().getDisplayName(TextStyle.FULL, Locale.US) + ": " + firstMonday);
    }

    public static void main(String[] args) {
        showTodayDay();
        showFirstMondayCurrent();
    }
}
