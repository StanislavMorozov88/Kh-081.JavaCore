package Lesson13.Homeworks;

import java.time.LocalDate;


public class Hw4 {
    public static void dayOfWeek(LocalDate ld){
        System.out.println("Your birthday was on: " + ld.getDayOfWeek());
        System.out.println("Day after 6 ,months: " + ld.plusMonths(6).getDayOfWeek());
        System.out.println("Day after 12 ,months: " +ld.plusMonths(12).getDayOfWeek());

    }

    public static void main(String[] args) {
        LocalDate myBirthday = LocalDate.of(1997,12,8);
        dayOfWeek(myBirthday);
    }
}
