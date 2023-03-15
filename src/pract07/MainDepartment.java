package pract07;

public class MainDepartment {
    public static void main(String[] args) throws CloneNotSupportedException {

        Department department = new Department("Lviv", "Shevchenko street", 32, "Liceum");

        System.out.println(department);

        Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.setCity("Kyiv");

        System.out.println("Cloned " + copyOfDepartment);
    }
}
