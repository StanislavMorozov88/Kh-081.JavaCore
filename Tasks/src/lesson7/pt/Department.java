package lesson7.pt;

//Create class Department which contains field name of String type and field address of Address type
//In class Department create inner class Address with city and street fields of String type and building of type int
public class Department implements Cloneable {
    private String name;
    private Address address;

    //create inner class Address
    public static class Address implements Cloneable {
        private String city;
        private String street;
        private int building;
        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
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

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
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

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address=(Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }
}
