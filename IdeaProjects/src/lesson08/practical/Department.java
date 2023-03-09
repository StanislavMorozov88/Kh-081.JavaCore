package lesson08.practical;

public class Department implements Cloneable {
    private String name;
    private Address address = new Address();

    public Department(String name, String city, String street, int building) {
        checkName(name);
        checkCity(city);
        checkStreet(street);
        this.name = name;
        address.city = city;
        address.street = street;
        address.building = building;
    }

    public class Address implements Cloneable {
        private String city;
        private String street;
        private int building;

        public String getCity() {
            return city;
        }

        public String getStreet() {
            return street;
        }

        public int getBuilding() {
            return building;
        }

        public void setCity(String city) {
            checkCity(city);
            this.city = city;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            return city + ", " + street + ", " + building;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void checkName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name is null or empty");
        }
    }

    public void checkCity(String city) {
        if (city == null || city.isBlank()) {
            throw new IllegalArgumentException("City is null or empty");
        }
    }

    public void checkStreet(String street) {
        if (street == null || street.isBlank()) {
            throw new IllegalArgumentException("Street is null or empty");
        }
    }

    @Override
    public String toString() {
        return "Department[" +
                "name='" + name + '\'' +
                ", address=" + address +
                ']';
    }
}
