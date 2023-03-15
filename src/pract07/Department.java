package pract07;

public class Department implements Cloneable {
    private Address address = new Address();
    private String name;
    public Department(String city, String street, int building, String name) {
        address.city = city;
        address.street = street;
        address.building = building;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Department{" +
                "address=" + address +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        return copyOfDepartment;
    }

    public void setCity(String city) {
        address.city = city;
    }

    private class Address {
        private String city;
        private String street;
        private int building;

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
}

