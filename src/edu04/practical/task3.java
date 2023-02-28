package edu04.practical;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the name of the country");
        String input = scan.nextLine();
        scan.close();
        switch (input){
            case "Ukraine" -> System.out.println(Continents.Eur.getName());
            case "Egypt" -> System.out.println(Continents.Afr.getName());
            case "Australia" -> System.out.println(Continents.Aus.getName());
            case "USA" -> System.out.println(Continents.NA.getName());
            case "Brazil" -> System.out.println(Continents.SA.getName());
            case "China" -> System.out.println(Continents.Eur.getName());
            case "Morocco" -> System.out.println(Continents.Afr.getName());
            case "France" -> System.out.println(Continents.Eur.getName());
            default -> System.out.println("I don't know");
        }
    }
}
