package Lesson4.PrTask;

public enum Continent {
    ASIA("Japan", "China", "Kazakhstan"), EUROPE("Ukraine", "Poland", "Litva"), NORTH_AMERICA("USA", "Canada"), SOUTH_AMERICA("Brazil", "Argentina", "Columbia"), AFRICA("Mauritania", "Tunis"), AUSTRALIA("Australia");
    private String contry1;
    private String contry2;
    private String contry3;

    Continent(String country1, String country2, String country3) {
        this.contry1 = country1;
        this.contry2 = country2;
        this.contry3 = country3;
    }

    Continent(String country1, String country2) {
        this.contry1 = country1;
        this.contry2 = country2;
    }

    Continent(String country1) {
        this.contry1 = country1;
    }

    public String getContry1() {
        return contry1;
    }

    public String getContry2() {
        return contry2;
    }

    public String getContry3() {
        return contry3;
    }
}