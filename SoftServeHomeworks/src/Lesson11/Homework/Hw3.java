package Lesson11.Homework;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hw3 {
    public static void main(String[] args) {
        String str = "i have $100000.00 and $321.00 but $1.00 la la la $231321123.00 and $432";
        allDollars(str);
    }
    public static void allDollars(String str){
        Pattern p = Pattern.compile("\\$\\d+\\.\\d{2}");
        Matcher m = p.matcher(str);
        while(m.find()){
            int start = m.start();
            int end = m.end();
            System.out.println(str.substring(start,end));
        }
    }
}
