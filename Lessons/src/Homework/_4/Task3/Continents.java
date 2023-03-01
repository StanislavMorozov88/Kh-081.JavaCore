package Homework._4.Task3;

public enum Continents {
    Asia("Азія"),
    Africa("Африка"),
    Europe("Європа"),
    NorthAmerica("Північна Америка"),
    SouthAmerica("Південна Америка"),
    Australia("Австралія"),
    Antarctica("Антарктида");

    private final String name;
    Continents(String name) {
        this.name = name;
    }

    public Continents getCountriesContinent(String country) throws Exception {

        switch (country.toLowerCase()){
            case "україна" -> {
                return Europe;
            }case "канада" -> {
                return NorthAmerica;
            }case "бразилія" -> {
                return SouthAmerica;
            }case "кенія" -> {
                return Africa;
            }case "китай" -> {
                return Asia;
            }case "австралія" -> {
                return Australia;
            }case "антарктида" -> {
                System.out.println("Антарктида це не країна");
                return Antarctica;
            }default -> {
                System.err.println("Некоректний ввід назви країни, \nбудь ласка, оберайте із запропонованого списку");
                throw new Exception("Некоректний ввід назви країни, \nбудь ласка, оберайте із запропонованого списку");
            }
        }

    }
    public String getContinent(){
        return name;
    }
}

