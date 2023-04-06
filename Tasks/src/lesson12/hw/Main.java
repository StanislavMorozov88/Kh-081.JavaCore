package lesson12.hw;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Year;
import java.util.Date;
import java.util.InputMismatchException;

/**
 * 1. Create two methods String encrypt(String s, int n)
 * and String decrypt(String s, int n)
 * Method encrypt should take a string and return coded string
 * where every letter is moved on n positions in alphabet (e.g. encrypt("abc", 3) returns "def“).
 * Method decrypt should return decoded value
 * 2. Create method to validate date according to format "mm.dd.yy"*
 * 3. Create method which take year as a parameter and return true if year is a leap
 * 4. Create variable leap and set to that variable date your birthday.
 * Create method that take as a parameter object LocalDate
 * and print the day of the week and what was the day of the week after 6 months and what was the day of the week after 12 months.
 */
public class Main {
    public static void main(String[] args) {
        //1
        String s = "abc";
        System.out.println("Coded string - " + encrypt(s, 3));
        System.out.println("Decoded - " + decrypt(encrypt(s, 3), 3));

        //2
        String date = "23.06.2303";
        String date1 = "12.03.21";
        String pattern = "MM.dd.yy";
        System.out.println("Is " + date + " valid date? " + validateFormat(date, pattern));
        System.out.println("Is " + date1 + " valid date? " + validateFormat(date1, pattern));

        //3
        LocalDate localDate = LocalDate.now();
        int f = 2033;
        int g = 2044;
        int d = 23;
        try {
            System.out.println("Is " + localDate.getYear() + " a leap year? " + isLeapYear(localDate.getYear()));
            System.out.println("Is " + f + " a leap year? " + isLeapYear(f));
            System.out.println("Is " + g + " a leap year? " + isLeapYear(g));
            System.out.println("Is " + d + " a leap year? " + isLeapYear(d));

        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }

        //4
        LocalDate birthday = LocalDate.of(2003, 6, 16);
        System.out.println(dayOfWeekAfterSixAndTwelveMonths(birthday));

    }

    //im sorry that i called method like this :)
    public static String dayOfWeekAfterSixAndTwelveMonths(LocalDate localDate) {
        String day = String.valueOf(localDate.getDayOfWeek());
        String afterSix = String.valueOf(localDate.plusMonths(6).getDayOfWeek());
        String afterTwelve = String.valueOf(localDate.plusMonths(12).getDayOfWeek());
        return String.format("The day of the week was %s, the day of the week after 6 months was %s, the day of the week after 12 months was %s", day, afterSix, afterTwelve);
    }

    public static boolean isLeapYear(int year) {
        if (!validateFormat(String.valueOf(year), "yyyy")) {
            throw new InputMismatchException("invalid year");
        } else {
            return Year.isLeap(year);
        }
    }

    public static boolean validateFormat(String data, String pattern) {
        Date s = null;
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
            s = simpleDateFormat.parse(data);
            if (!data.equals(simpleDateFormat.format(s))) {
                s = null;
            }
        } catch (ParseException e) {
            System.err.println(e.getMessage() + "\n");
        }
        return s != null;
    }

    //idk how do it with stream .-., its a difficult, i dont understand, :(
    //i can only do smth like that(use Strings, loops and conditions)
    public static String encrypt(String s, int n) {
        //to lower case for match with alphabet string
        String o = s.toLowerCase();

        //string of alphabet
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        //temp array of chars for fill new chars
        char[] tempChars = new char[o.toCharArray().length];
        //first loop goes through our String by every element
        for (int j = 0; j < o.length(); j++) {
            //second goes through alphabet
            for (int i = 0; i < alphabet.length(); i++) {
                //catch matching of chars
                if (o.charAt(j) == alphabet.charAt(i)) {
                    int temp = i + n;
                    tempChars[j] = alphabet.charAt(temp);
                }
            }
        }
        //convert char array to string and return
        return String.valueOf(tempChars);
    }

    public static String decrypt(String s, int n) {
        String o = s.toLowerCase();
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        char[] tempChars = new char[o.toCharArray().length];
        for (int j = 0; j < o.length(); j++) {
            for (int i = 0; i < alphabet.length(); i++) {
                if (o.charAt(j) == alphabet.charAt(i)) {
                    if (i >= n) {
                        int temp = i - n;
                        tempChars[j] = alphabet.charAt(temp);
                    } else {
                        tempChars[j] = ' ';
                    }
                }
            }
        }
        return String.valueOf(tempChars);
    }

}
