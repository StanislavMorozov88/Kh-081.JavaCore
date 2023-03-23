package com.softserve.edu11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexHtml {
    public static void main(String[] args) {

        // String pattern = "<.+>";//true
        // String pattern = "<[^>]+>"; //tags
        String pattern = ">[^><]*<";//отак виведе текст

        String text = "<p><b>Beginning with bold text</b> next, <span>text</span> body,<i>italic text</i> end of text.</p>";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);

        if (m.matches()) {
            System.out.println("m.matches() return True");
        } else {
            System.out.println("m.matches() return FALSE");
        }

        m.reset(); // Reset Iterator
        while (m.find()) {
            // System.out.print(" *" + text.substring(m.start(), m.end()) + "* ");
            System.out.print(text.substring(m.start() + 1, m.end() - 1).trim());//отак виведе текст
        }
    }
}
