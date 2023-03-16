package com.softserve.edu08;
/**Create a class called Department that contains a name field of String type and an address field of Address type.
        *In the Department class, create an inner class called Address with has city and street fields of String type and building field of type int.
        *In main() method, create an instance for one department and initialize it.
        *Then, create one more department by cloning previously created department and change the city for this object.
       * Output information about all departments to the console.
*/
public class Department {

    private String name;
    private Address address;

    public static class Address {
        private String city;
        private String street;
        private int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public Address(Address other) {
            this.city = other.city;
            this.street = other.street;
            this.building = other.building;
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
    public Department(String name, String city, String street, int building) {
        this.name = name;
        this.address = new Address(city, street, building);
    }

    public Department(Department other) {
        this.name = other.name;
        this.address = new Address(other.address);
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    public static void main(String[] args) {
        Department department1 = new Department("Department 1", "New York", "Broadway", 123);
        Department department2 = new Department(department1);
        department2.getAddress().setCity("Los Angeles");

        System.out.println(department1);
        System.out.println(department2);
    }


}
