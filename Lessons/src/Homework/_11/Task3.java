package Homework._11;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mony = sc.nextLine().trim();
        Pattern pattern = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher matcher = pattern.matcher(mony);
        System.out.println("US currency in text:");
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}
/*
* Implement a pattern for US currency:
*    the first symbol "$", then any number of digits, dot and two digits after the dot.
* Enter the text from the console that contains several occurrences of US currency.
* Display all occurrences on the screen
 */