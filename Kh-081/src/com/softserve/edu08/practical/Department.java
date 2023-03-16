//package com.softserve.edu08.practical;
//
//public class Department implements Cloneable {
//    private String name;
//    private Address address;
//
//    public Department(String name, String city, String street, int building) {
//        this.name = name;
//        this.address = new Address(city, street, building);
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Address getAddress() {
//        return address;
//    }
//
//    @Override
//    public Department clone() throws CloneNotSupportedException {
//        Department cloned = (Department) super.clone();
//        cloned.address = address.clone();
//        return cloned;
//    }
//
//    private class Address implements Cloneable {
//        private String city;
//        private String street;
//        private int building;
//
//        public Address(String city, String street, int building) {
//            this.city = city;
//            this.street = street;
//            this.building = building;
//        }
//
//        public String getCity() {
//            return city;
//        }
//
//        public void setCity(String city) {
//            this.city = city;
//        }
//
//        public String getStreet() {
//            return street;
//        }
//
//        public int getBuilding() {
//            return building;
//        }
//
//        @Override
//        public Address clone() throws CloneNotSupportedException {
//            return (Address) super.clone();
//        }
//    }
//}
//
//class Main {
//    public static void main(String[] args) throws CloneNotSupportedException {
//        Department department1 = new Department("Department1", "Kyiv", "Shevchenka", 10);
//        Department department2 = department1.clone();
//        department2.getAddress().setCity("Lviv");
//
//        System.out.println("Department1 name: " + department1.getName() + ", city: " + department1.getAddress().getCity());
//        System.out.println("Department2 name: " + department2.getName() + ", city: " + department2.getAddress().getCity());
//    }
//}
