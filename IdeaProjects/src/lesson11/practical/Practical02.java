package lesson11.practical;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practical02 {
    private static final String FIRST = "name";
    private static final String LAST = "surname";
    private static final String MIDDLE = "patronymic";

    protected static Scanner SC = new Scanner(System.in);
    private static final String NAMES_PATTERN = "[A-Za-z]{2,20}";

    public static Map<String, String> getPersonalDataFromConsole() {
        Map<String, String> personalData = new HashMap<>();
        System.out.println("Enter surname: ");
        personalData.put(LAST, readName());
        System.out.println("Enter name: ");
        personalData.put(FIRST, readName());
        System.out.println("Enter patronymic name: ");
        personalData.put(MIDDLE, readName());
        return personalData;
    }

    public static void printSurnameAndInitials(Map<String, String> personality) {
        System.out.printf("%s %.1s.%.1s.%n", personality.get(LAST), personality.get(FIRST), personality.get(MIDDLE));
    }

    public static void printName(Map<String, String> personalData) {
        System.out.printf("Person name: %s%n", personalData.get(FIRST));
    }

    public static void printFirstMiddleLast(Map<String, String> personalData) {
        String firstMiddleLast = String.join(" ", personalData.get(FIRST), personalData.get(MIDDLE), personalData.get(LAST));
        System.out.println(firstMiddleLast);
    }

    private static String readName() {
        while (true) {
            String name = SC.nextLine();
            if (!isMatched(name)) {
                System.out.println("Incorrect data. Enter again: ");
            } else return format(name);
        }
    }

    private static String format(String string) {
        return String.join("", string.substring(0, 1).toUpperCase(), string.substring(1).toLowerCase());
    }

    private static boolean isMatched(String name) {
        Pattern p = Pattern.compile(NAMES_PATTERN);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    public static void main(String[] args) {
        Map<String, String> personalData = getPersonalDataFromConsole();
        printSurnameAndInitials(personalData);
        printName(personalData);
        printFirstMiddleLast(personalData);
    }
}
