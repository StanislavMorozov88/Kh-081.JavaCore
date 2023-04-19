package com.softserve.lesson13.homeTask;

import java.time.Year;

public class Hw3 {
    public static boolean isYearLeap(int year){
        return Year.isLeap(year);
    }

    public static void main(String[] args) {
        System.out.println(isYearLeap(1917));
    }
}
