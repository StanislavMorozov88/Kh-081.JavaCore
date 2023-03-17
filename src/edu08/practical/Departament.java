package edu08.practical;

public class Departament implements Cloneable {
    private String name;
    private Address address;

    public Departament(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    protected Departament clone() throws CloneNotSupportedException {
        return (Departament) super.clone();
    }

    public static class Address{
        private String city, street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public void setCity(String city) {
            this.city = city;
        }

        @Override
        public String toString() {
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }
}
