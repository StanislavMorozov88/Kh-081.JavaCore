package lesson13.home;

import java.time.Year;
import java.util.Scanner;

public class Task03 {
    static final Scanner SC = new Scanner(System.in);

    public static boolean isLeapYear(int year) {
        return Year.isLeap(year);
    }

    //Я відсіювала негативні значення для year. Хоча я знаю, що до н.е може мати негативне значення. Але в данному випадку я такі роки скіпнула свідомо.
    public static int getYearFromConsole() {
        int year;
        do {
            System.out.println("Enter positive value for year: ");
            try {
                year = Integer.parseInt(SC.next());
            } catch (NumberFormatException e) {
                System.err.println("not year");
                year = -1;
            }
        } while (year <= 0);
        return year;
    }

    public static void main(String[] args) {
        int year = getYearFromConsole();
        System.out.println("Year " + year + " is leap year?: " + isLeapYear(year));
    }
}
