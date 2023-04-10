package edu13.homework;

import javax.management.StringValueExp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class task2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2023,07, 15);
        System.out.println(dateValidator(String.valueOf(date))); //false

        String str2 = "15.01.22";
        System.out.println(dateValidator(str2)); //true

        String str3 = "22.09.1945";
        System.out.println(dateValidator(str3)); //false

        //Увага! Це сирий розв'язок, якщо ця ідея ОК, тоді можна гратись із регулярними виразами.
        //Якщо є якісь спеціальні методи, для вирішення цієї задачі, дайте будь ласка знати.

    }

    private static boolean dateValidator(String str){
        Pattern pattern = Pattern.compile("\\d{2}\\.\\d{2}\\.\\d{2}");
        Matcher matcher = pattern.matcher(str);
        boolean result = matcher.matches();
        return result;
    }

}
