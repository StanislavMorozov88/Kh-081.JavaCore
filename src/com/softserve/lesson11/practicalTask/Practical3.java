package com.softserve.lesson11.practicalTask;

import java.util.regex.*;

public class Practical3 {

    public static void main(String[] args) {
        System.out.println(checkWithRegExp("Babylon"));
        System.out.println(checkWithRegExp("IceFrog"));
        System.out.println(checkWithRegExp("Gnome"));
        System.out.println(checkWithRegExp("Trump_1488"));
        System.out.println(checkWithRegExp("Obama_-228"));
    }

    public static boolean checkWithRegExp(String userNameString){
        Pattern p = Pattern.compile("^[A-Za-z0-9_-]{3,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

}
