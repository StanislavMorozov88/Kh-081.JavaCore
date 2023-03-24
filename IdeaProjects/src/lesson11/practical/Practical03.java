package lesson11.practical;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practical03 {
    private static final String NAME_PATTERN = "[\\w]{3,15}";
    private static final Scanner SC = new Scanner(System.in);

    public static void checkUserNameFromConsole(){
        int count = 5;
        do {
            System.out.println("Enter User name: ");
            String name = readName();
            validationOutput(name);
        }while (--count>0);
    }

    private static String readName(){
        return SC.nextLine();
    }

    private static boolean isMatched(String name){
        Pattern p = Pattern.compile(NAME_PATTERN);
        Matcher m = p.matcher(name);
        return m.matches();
    }

    private static void validationOutput(String name) {
        if (isMatched(name)){
            System.out.printf("User name '%s' is correct%n", name);
        }else {
            System.out.printf("User name '%s' is incorrect%n", name);
        }
    }

    public static void main(String[] args) {
        checkUserNameFromConsole();

    }
}
