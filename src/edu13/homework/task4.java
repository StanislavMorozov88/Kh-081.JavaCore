package edu13.homework;

import java.time.LocalDate;

public class task4 {
    public static void main(String[] args) {
        LocalDate birthday = LocalDate.of(1995, 8, 18);
        System.out.println(birthday);
        dayOfWeek(birthday);
    }

    private static void dayOfWeek(LocalDate date){
        System.out.println("Day of the week : " + date.getDayOfWeek());
        System.out.println("Day of the week after 6 months : " + date.plusMonths(6).getDayOfWeek());
        System.out.println("Day of the week after 12 months : " + date.plusMonths(12).getDayOfWeek());
    }

}
