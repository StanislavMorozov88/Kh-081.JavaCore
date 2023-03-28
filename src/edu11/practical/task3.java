package edu11.practical;
import java.util.regex.*;
import java.util.regex.Pattern;

public class task3 {
    public static void main(String[] args) {
        String name1 = "1D32aA---1";
        String[] name = {"1 - Ivan", "2 - Borys", "3__OLeksandr", "Mykyta - 123456789", "Yehor - 5"};

        Pattern pattern = Pattern.compile(("[(\\w-\\s+?)]{3,15}"));
        for(int i = 0; i < name.length; i++){
            Matcher matcher = pattern.matcher(name[i]);
            boolean result = matcher.matches();
            System.out.println(name[i] + " : " + result);
        }


    }
}
