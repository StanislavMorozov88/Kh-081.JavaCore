package edu08.practice;

public class Department {
    private String name;
    private Address address;

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Department(Department department) {
        this.name = department.name;
        this.address = new Address(department.address.city, department.address.street, department.address.building);
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void printInfo() {
        System.out.println("Department: " + name);
        System.out.println("Address: " + address.toString());
    }


    public static class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public int getBuilding() {
            return building;
        }

        public void setBuilding(int building) {
            this.building = building;
        }

        @Override
        public String toString() {
            return city + ", " + street + " " + building;
        }
    }

    public static void main(String[] args) {
        Address address1 = new Address("Truskavets", "Stebnytska", 1);
        Department department1 = new Department("Local Department", address1);
        department1.printInfo();

        Department department2 = new Department(department1);
        department2.getAddress().setCity("Drohobych");
        department2.printInfo();
    }
}
