package PracticalTask._4.Task3;

import java.util.Scanner;

public class Main {
    //по пріколу, не зважайте
    private static String capitalizeFirstLetter(String str){
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    public static void main(String[] args) {
        System.out.println( "Введіть назву країни із запропонованих, " +
                            "щоб дізнатися, якому континенту вона належить:"+
                            "\n(Доступні країни: україна, канада, кенія, китай, бразилія, австралія)");
        try {
            Scanner sc = new Scanner(System.in);
            String country = sc.nextLine();
            sc.close();

            Continents continent = Continents.Asia.getCountriesContinent(country);
            System.out.println(capitalizeFirstLetter(country)
                    + " належить до континенту \""
                    + continent.getContinent()
                    + "\".");
        }catch (Exception e){
            System.err.println("Почніть заново");
        }
    }
}
