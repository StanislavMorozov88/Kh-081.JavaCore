package PracticalTask._8.Task1;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Peter", new Department.Address("Lviv", "Franka", 12) );

        Department copyOfdepartment = (Department) department.clone();
        copyOfdepartment.setAddress(new Department.Address("Ternopil", "Valova", 4));
        copyOfdepartment.setName("Ira");

        System.out.println(department.toString());
        System.out.println(copyOfdepartment.toString());

    }
}
