package lesson13.home;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.TextStyle;
import java.util.Locale;

public class Task04 {
    public static void print(LocalDate myBirthDay) {
        System.out.println("Original date: " + myBirthDay);
        System.out.println("Day of week : " + getDayOfWeek(myBirthDay));
        int month = 6;
        do {
            System.out.println("Day of week after " + month + " month: " + getDayOfWeek(myBirthDay.plusMonths(month)));
            month += 6;
        } while (month <= 12);
    }

    private static String getDayOfWeek(LocalDate date) {
        return date.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
    }

    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1900, Month.MARCH, 10);
        print(birthday);
    }
}
