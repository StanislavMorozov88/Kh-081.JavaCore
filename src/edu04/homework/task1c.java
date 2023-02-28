package edu04.homework;

import java.util.Scanner;

public class task1c {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of HTTP Error");
        String input = scan.nextLine();
        scan.close();
        switch (input){
            case "400" -> System.out.println(HTTPError.HTTPError400.getName());
            case "401" -> System.out.println(HTTPError.HTTPError401.getName());
            case "402" -> System.out.println(HTTPError.HTTPError402.getName());
            case "403" -> System.out.println(HTTPError.HTTPError403.getName());
            case "404" -> System.out.println(HTTPError.HTTPError404.getName());
            case "405" -> System.out.println(HTTPError.HTTPError405.getName());
            default -> System.out.println("I don't know");
        }

    }
}
