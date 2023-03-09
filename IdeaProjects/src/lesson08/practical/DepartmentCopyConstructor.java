package lesson08.practical;
//another solution with copy constructor

public class DepartmentCopyConstructor {
    private String name;
    private Address address = new Address();


    public DepartmentCopyConstructor(String name, String city, String street, int building) {
        checkName(name);
        checkCity(city);
        checkStreet(street);
        this.name = name;
        address.city = city;
        address.street = street;
        address.building = building;
    }

    public DepartmentCopyConstructor(DepartmentCopyConstructor cloneDep) {
        this(cloneDep.name, cloneDep.address.getCity(), cloneDep.address.getStreet(), cloneDep.address.getBuilding());
    }

    public class Address {
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
        public String toString() {
            return city + ", " + street + ", " + building;
        }
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
        return "DepartmentCopyConstructor[" +
                "name='" + name + '\'' +
                ", address=" + address +
                ']';
    }
}
