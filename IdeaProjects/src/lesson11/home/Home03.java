package lesson11.home;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Home03 {
    private static final String US_PATTERN = "\\$\\d+\\.\\d{2}";

    public static void printOccurrences(String usOccurrences) {
        Pattern p = Pattern.compile(US_PATTERN);
        Matcher m = p.matcher(usOccurrences);
        while (m.find()){
            System.out.println(String.join(", ", usOccurrences.substring(m.start(),m.end())));
        }
    }

    public static void main(String[] args) {
        String usOccurrences = "$123.45$12.45.12.35$$8888.456";
        printOccurrences(usOccurrences);
    }
}
