package edu04.practice;

import java.util.Arrays;

public class Country {
    enum Continent {
        EUROPE, ASIA, AFRICA, NORTHAMERICA, SOUTHAMERICA;

        final String[] europeanCountries = {"Ukraine", "France", "Germany", "Poland"};
        final String[] asianCountries = {"Pakistan", "India", "Iran", "Turkey"};
        final String[] africanCountries = {"Congo", "Egypt", "Madagascar", "Morocco"};
        final String[] northAmericanCountries = {"Canada", "USA", "Mexico", "Cuba"};
        final String[] southAmericanCountries = {"Brazil", "Argentina", "Chile", "Peru"};

        boolean isCountryThere(String[] array, String var) {
            if (Arrays.asList(array).contains(var)) return true;
            else return false;
        }

        void printTheNameOfTheContinent(String country) {
            String s = "This country belongs to: ";
            if (isCountryThere(europeanCountries, country)) System.out.println(s + EUROPE);
            else if (isCountryThere(asianCountries, country)) System.out.println(s + ASIA);
            else if (isCountryThere(africanCountries, country)) System.out.println(s + AFRICA);
            else if (isCountryThere(northAmericanCountries, country)) System.out.println(s + NORTHAMERICA);
             else if (isCountryThere(southAmericanCountries, country)) System.out.println(s + SOUTHAMERICA);
            else throw new IllegalArgumentException("There is no such country.");
        }

        public static void main(String[] args) {
            Continent c = Continent.EUROPE;
            c.printTheNameOfTheContinent("Ukraine");
        }

    }
}