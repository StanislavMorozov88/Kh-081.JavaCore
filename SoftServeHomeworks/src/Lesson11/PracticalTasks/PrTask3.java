package Lesson11.PracticalTasks;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrTask3 {
    static Scanner sc = new Scanner(System.in);
    public static void enterUsername (String userName){
        checker(userName);
        while (!checker(userName)){
            System.out.println("You entered incorrect username, pls retry");
            userName = sc.nextLine();
        }
        System.out.println("You entered correct username");


    }
    public static boolean checker (String userName){
        Pattern p = Pattern.compile("\\w{3,15}");
        Matcher m = p.matcher(userName);
        return m.matches();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String userName = sc.nextLine();


        enterUsername(userName);
    }
}
