package com.softserve.lesson13.homeTask;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Hw2 {
    public static void format(String s) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(s, formatter);
            System.out.println(s);
        }catch (DateTimeParseException e){
            System.err.println("invalid type of date, it should be as: \"MM.dd.yy\"");
        }
    }

    public static void main(String[] args) {
        format("11.09.01");
    }
}
