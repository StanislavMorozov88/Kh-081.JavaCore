package Lesson13.Homeworks;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Hw2 {
    public static void format(String str) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM.dd.yy");
        try {
            LocalDate.parse(str, dtf);
            System.out.println(str);
        }catch (DateTimeParseException e){
            System.out.println("invalid type of date, it should be as: \"MM.dd.yy\"");
        }
    }

    public static void main(String[] args) {
        format("8.12.97");
    }
}
