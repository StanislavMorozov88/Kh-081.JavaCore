package Lesson11.PracticalTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrTask2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter your FIO: ");
        String name = sc.nextLine();
        System.out.println(name.substring(0,name.indexOf(" ") )+" " + name.charAt(name.indexOf(" " )+1) +"." + name.charAt(name.lastIndexOf(" ")+1) + ".");
        System.out.println(name.substring(name.indexOf(" ")+1,name.lastIndexOf(" ")));
        System.out.println(name.substring(name.indexOf(" ")+1,name.lastIndexOf(" ") ) + name.substring(name.lastIndexOf(" "))+" " +name.substring(0,name.indexOf(" ") ) );
    }
}