package home_tasks;

import java.util.Scanner;

public class PersonalInfo {
    public static void main(String[] args) {

        System.out.println("What is your name?");
        String name = getAnswer();
        System.out.println("Where are you live, " + name + "?");
        String address = getAnswer();
        printPersonalInfo(name,address);

    }
    private static String getAnswer(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void printPersonalInfo(String name, String address){
        System.out.println("Person name is: " + name);
        System.out.println("Address: " + address);
    }
}
