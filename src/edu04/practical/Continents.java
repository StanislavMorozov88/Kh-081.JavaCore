package edu04.practical;

public enum Continents {
    Eur("Eurasia"), Afr("Africa"), NA("North America"), SA("South America"),
    Aus("Australia"), Ant("Antarctica");

    private final String name;
    Continents (String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
