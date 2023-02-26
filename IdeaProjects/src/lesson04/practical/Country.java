package lesson04.practical;

import java.util.Scanner;

public class Country {
    private static final Scanner SC = new Scanner(System.in);

    private static String readCountry() {
        return SC.nextLine();
    }

    public static void printContinent() {
        boolean hasCountry = true;
        while (hasCountry) {
            hasCountry = false;
            System.out.println("Enter country: ");
            String country = readCountry();

            for (Continent c : Continent.values()) {
                if (c.getCountryList().contains(country.toLowerCase())) {
                    System.out.println(c);
                    hasCountry = true;
                }
            }
            if (!hasCountry) {
                System.out.println("Unfortunately, there is no information about such a country");
            }
        }
    }
}
