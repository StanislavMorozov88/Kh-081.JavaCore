package lesson7.pt;

//Create class Department which contains field name of String type and field address of Address type
//In class Department create inner class Address with city and street fields of String type and building of type int
//In main method create an instance for one department and initialize it.
//Create one more department by cloning previous created department, change city for this object
//Print information about all departments


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department=new Department("32", new Department.Address("London","Baker str.",43));
        Department copyOfDepartment = (Department) department.clone();
        copyOfDepartment.setAddress(new Department.Address("Paris","Saint str.",12));

        System.out.println(copyOfDepartment);
        System.out.println(department);
    }
}
