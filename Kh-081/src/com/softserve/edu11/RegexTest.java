package com.softserve.edu11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTest {
    public static void main(String[] args) {

        //String pattern = "Now is the time";
       // String pattern = "[Na-z ]+";
        String pattern = "[A-Za-z ]+";
      //  String pattern = "[a-z]+";
        String text = "Now is the time";

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
