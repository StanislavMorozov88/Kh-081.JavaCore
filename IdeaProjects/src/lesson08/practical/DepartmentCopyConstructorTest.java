package lesson08.practical;
//this is another solution with copy constructor

public class DepartmentCopyConstructorTest {
    public static void main(String[] args) {
        DepartmentCopyConstructor depOrig = new DepartmentCopyConstructor("Department", "Kyiv", "Naberezhna", 25);
        DepartmentCopyConstructor copyDep = new DepartmentCopyConstructor(depOrig);

        System.out.println("Original department: " + depOrig);
        System.out.println("Copy of department: " + copyDep);

        copyDep.getAddress().setCity("Kharkiv");


        System.out.println("----------------------------------------------------------------------");
        System.out.println("Original department: " + depOrig);
        System.out.println("Copy of department: " + copyDep);
    }
}
