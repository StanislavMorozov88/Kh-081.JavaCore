package com.softserve.lesson4.practicalTask;

import java.util.Scanner;

/**
 * This program asks user to input name of the country
 *      and then outputs name of the continent
 */
public class Task3 {

    // Record of all continents
    enum Continent {
        AFRICA,
        NORTH_AMERICA,
        SOUTH_AMERICA,
        AUSTRALIA,
        ASIA,
        EUROPE,
        ANTARCTICA
    }

    /**
     * Main method runs program and decide which country belongs
     *      to which continent
     */
    public static void main(String[] args) {
        System.out.println("Enter name of the country: ");
        Scanner sc = new Scanner(System.in); //Creating scanner
        String countryName = sc.nextLine();
        sc.close(); // Closing scanner
        Continent continent = switch (countryName) {
            case "Algeria", "Libya", "Egypt" -> Continent.AFRICA;
            case "The Bahamas", "Canada", "Costa Rica" -> Continent.NORTH_AMERICA;
            case "Argentina", "Colombia", "Paraguay" -> Continent.SOUTH_AMERICA;
            case "Mainland Australia" -> Continent.AUSTRALIA;
            case "Japan", "China", "South Korea" -> Continent.ASIA;
            case "Ukraine", "Poland", "Spain" -> Continent.EUROPE;
            case "Antarctica" -> Continent.ANTARCTICA;
            default -> Continent.AFRICA;
        };
        System.out.println(continent);
    }


}
