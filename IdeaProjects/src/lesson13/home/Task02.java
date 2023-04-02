package lesson13.home;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.ResolverStyle;

public class Task02 {
    static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM.dd.uuuu").withResolverStyle(ResolverStyle.STRICT);

    public static boolean isValid(String str) {
        try {
            LocalDate.parse(str, dateTimeFormatter);
        } catch (DateTimeParseException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String date1 = "03.10.1983";
        System.out.println("Is valid date '" + date1 + "'?: " + isValid(date1));

        String date2 = "13.02.2024";
        System.out.println("Is valid date '" + date2 + "'?: " + isValid(date2));
    }
}
