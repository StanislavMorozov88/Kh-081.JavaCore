package PracticalTask._13;

import java.time.DayOfWeek;
import java.time.LocalDate;
import static Homework._5.Task1.getEnd;

public class Task1 {
    /**
     * Show which today is a day of a week
     * <br>Show a date of first Monday for current month
     */
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalDate firstDayOfMonth = date.withDayOfMonth(1);

        //We iterate until we get the first Monday
        while (firstDayOfMonth.getDayOfWeek() != DayOfWeek.MONDAY) {
            firstDayOfMonth = firstDayOfMonth.plusDays(1);
        }

        //Just typing, the try-catch is here because it used the getEnd() method
        System.out.println("Today is \033[0;36m" + date.getDayOfWeek().toString().toLowerCase() + "\033[0m.");
        try {
            System.out.println("First monday is \033[0;36m"
                    + firstDayOfMonth.getDayOfMonth() + getEnd(firstDayOfMonth.getDayOfMonth())
                    + "\033[0m day of \033[0;36m"
                    + date.getMonth().toString().toLowerCase() + "\033[0m.");
        } catch (RuntimeException e) {
            throw new RuntimeException(e);
        }
    }
}
