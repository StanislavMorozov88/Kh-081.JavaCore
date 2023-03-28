package homework11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the text:");
        String text = scanner.nextLine();

        String pattern = "^\\$(\\d+)(\\.\\d{2})";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("m.matches() return True");
        } else {
            System.out.println("m.matches() return False");
        }
    }
}
