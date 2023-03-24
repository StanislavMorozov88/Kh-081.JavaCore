package lesson11.home;

import java.util.Scanner;
import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home03 {
    private static final Scanner SC = new Scanner(System.in);
    private static final String US_PATTERN = "\\$\\d+\\.\\d{2}";

    public static String printUsCurrency() {
        System.out.println("Enter US Currency: ");
        String currency = SC.nextLine();
        System.out.println("You enter: " + currency);
        return currency;
    }

    public static void printOccurrences(String currency) {
        Pattern p = Pattern.compile(US_PATTERN);
        Matcher m = p.matcher(currency);
        StringJoiner stringJoiner = new StringJoiner(", ");
        while (m.find()){
            stringJoiner.add(currency.substring(m.start(),m.end()));
        }
        printResult(stringJoiner);
    }

    private static void printResult(StringJoiner stringJoiner) {
        if (!stringJoiner.toString().isBlank()){
            System.out.println("Matches found: " + stringJoiner);
        }else {
            System.out.println("No matches");
        }
    }

    public static void main(String[] args) {
        String usCurrency = printUsCurrency();
        printOccurrences(usCurrency);
    }
}
