package lesson08.practical;

public class DepartmentTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department departmentOriginal = new Department("Trade", "Lviv", "Zelena", 28);
        Department copyOfDepartment = (Department) departmentOriginal.clone();

        System.out.println("Original department: " + departmentOriginal);
        System.out.println("Copy of department: " + copyOfDepartment);

        copyOfDepartment.getAddress().setCity("Ivano-Frankivsk");


        System.out.println("----------------------------------------------------------------------");
        System.out.println("Original department: " + departmentOriginal);
        System.out.println("Copy of department: " + copyOfDepartment);

    }
}
