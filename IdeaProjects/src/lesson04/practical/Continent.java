package lesson04.practical;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public enum Continent {
    ASIA("Asia"){
        List<String> getCountryList(){
            List<String>countryList = new ArrayList<>();
            try {
                countryList.addAll(Files.readAllLines(Paths.get("resources/country/asia_country"))
                        .stream().map(String::toLowerCase).collect(Collectors.toList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return countryList;
        }
    },
    AFRICA("Africa"){
        List<String> getCountryList(){
            List<String> countryList = new ArrayList<>();
            try {
                countryList.addAll(Files.readAllLines(Paths.get("resources/country/africa_country"))
                        .stream().map(String::toLowerCase).collect(Collectors.toList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return countryList;
        }
    },
    EUROPE("Europe") {
        List<String>getCountryList(){
        List<String> countryList = new ArrayList<>();
            try {
            countryList.addAll(Files.readAllLines(Paths.get("resources/country/europe_country"))
                    .stream().map(String::toLowerCase).collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
            return countryList;
        }
    },
    NORTH_AMERICA("North America") {
        List<String> getCountryList() {
            List<String> countryList = new ArrayList<>();
            try {
                countryList.addAll(Files.readAllLines(Paths.get("resources/country/north_america_country"))
                        .stream().map(String::toLowerCase).collect(Collectors.toList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return countryList;
        }
    },
    SOUTH_AMERICA("South America") {
        List<String> getCountryList() {
            List<String> countryList = new ArrayList<>();
            try {
                countryList.addAll(Files.readAllLines(Paths.get("resources/country/south_america_country"))
                        .stream().map(String::toLowerCase).collect(Collectors.toList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return countryList;
        }
    },
    AUSTRALIA("Australia") {
        List<String> getCountryList() {
            List<String> countryList = new ArrayList<>();
            try {
                countryList.addAll(Files.readAllLines(Paths.get("resources/country/australia_country"))
                        .stream().map(String::toLowerCase).collect(Collectors.toList()));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return countryList;
        }
    },
    ANTARCTICA("Antarctica") {
        List<String> getCountryList() {
            return List.of("british antarctic territory");
        }
    };

    private String countryName;

    abstract List<String> getCountryList();

    Continent(String countryName) {
        this.countryName = countryName;
    }

    @Override
    public String toString() {
        return countryName;
    }
}
