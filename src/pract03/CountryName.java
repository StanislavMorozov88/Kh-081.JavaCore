package pract03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountryName {
    enum Continent {
        EUROPE, ASIA
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the country name ");
        String country = br.readLine();

        Continent continent;
        switch (country) {
            case "Germany":
            case "France":
                System.out.println("EUROPE");
                ;
                break;
            case "China":
            case "Japan":
                System.out.println("ASIA");
                ;
                break;
            default:
                System.out.println("This continent doesn't exist");
        }

    }

}