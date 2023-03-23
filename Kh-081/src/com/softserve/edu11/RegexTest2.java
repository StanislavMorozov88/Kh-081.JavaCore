package com.softserve.edu11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest2 {
    public static void main(String[] args) {
       // String pattern = "[bt]{2}";
       // String pattern = "(abt)+";
       // String pattern = "(\\w)\\1";
       //  String pattern = "[b]{2}";
        String pattern = "\\b\\w*([\\w])\\1\\w*\\b";

        String text = "letter abba work abtc";

        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("m.matches() return True");
        } else {
            System.out.println("m.matches() return False");
        }
        m.reset();
        while (m.find()) {
            System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
        }
    }
}
