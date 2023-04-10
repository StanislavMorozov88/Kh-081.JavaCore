package pract13;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Task1 {
    public static void main(String[] args) {

        // Show which a day of week is today
        System.out.println(LocalDate.now().getDayOfWeek());

        // Get current date
        LocalDate currentDate = LocalDate.now();

        // Get the first day of the current month
        LocalDate firstDayOfMonth = currentDate.withDayOfMonth(1);

        //Find the first Monday in the current month
        LocalDate firstMondayOfMonth = firstDayOfMonth;
        while (firstMondayOfMonth.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstMondayOfMonth = firstMondayOfMonth.plusDays(1);
        }

        // Show the date of first Monday for the current month
        System.out.println("The date of the first Monday for the current month is " + firstMondayOfMonth);

    }
}
