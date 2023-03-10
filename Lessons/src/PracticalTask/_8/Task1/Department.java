package PracticalTask._8.Task1;

public class Department implements Cloneable {
    private String name;
    private Address address = new Address();

    public static class Address implements Cloneable {
        public String city;
        public String street;
        public int building;

        public Address(String city, String street, int building) {
            this.city = city;
            this.street = street;
            this.building = building;
        }

        public Address() {
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

    public Department() {
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        Department copyOfDepartment = (Department) super.clone();
        copyOfDepartment.address = (Address) copyOfDepartment.address.clone();
        return copyOfDepartment;
    }

    @Override
    public String toString() {
        return "Department{" +
                " name '" + this.name + '\'' +
                " city '" + this.address.city + '\'' +
                " street '" + this.address.street + '\'' +
                " building '" + this.address.building +
                '}';
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
}
