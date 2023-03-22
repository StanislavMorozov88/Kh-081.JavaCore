package com.softserve.lesson8.practicalTask;

public class Department implements Cloneable{
    private String name;
    private Address address;


    @Override
    public Department clone() throws CloneNotSupportedException {
        Department cloned = (Department) super.clone();
        cloned.address = address.clone();
        return cloned;
    }

    public Department(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static class Address implements Cloneable{
        private String city;
        private String street;
        private int building;

        @Override
        protected Address clone() throws CloneNotSupportedException {
            return (Address) super.clone();
        }

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
            return "Address{" +
                    "city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    ", building=" + building +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department1 = new Department("Department1", new Department.Address("Kyiv", "Shevchenka", 10));
        Department department2 = department1.clone();
        department2.getAddress().setCity("Lviv");

        System.out.println("Department1 name: " + department1.getName() + ", city: " + department1.getAddress().getCity());
        System.out.println("Department2 name: " + department2.getName() + ", city: " + department2.getAddress().getCity());
    }
}