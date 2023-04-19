package Experiments;

import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String text = "Now is the time";
        Pattern p = Pattern.compile(pattern);
        Matcher m = p.matcher(text);
        while (m.find()) {
//            System.out.println(text.substring(m.start(), m.end()) + "*");
            System.out.println(m.group());
        }
    }

}