package Lesson8.PracticalTasks;

public class PrTask1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Department department = new Department("Departament", new Department.Adress("Odesa", "Bunina", 2));
        //Department dep = new Department("Dep", new Department.Adress("Chornomorsk", "Parkova", 9));
//        Department.Adress adress = new Department.Adress("Chornomorsk", "Parkova", 9).clone();
//
//        System.out.println(department);
//        System.out.println(adress);

        Department dep1 = new Department("Dep", new Department.Adress("Chornomorsk", "Parkova", 9).clone());
        System.out.println(department);
        System.out.println(dep1);


    }
}
