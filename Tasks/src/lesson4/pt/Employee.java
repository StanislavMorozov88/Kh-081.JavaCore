package lesson4.pt;

import java.util.Scanner;

//Create a class Employee with fields name, department number, salary. Create five objects of class Employee.
//      Display
//        all employees of a certain department (enter department number in the console);
//        arrange workers by the field salary in descending order.
public class Employee {
    private String name;
    private int departNum;
    private float salary;

    public Employee(String name, int departNum, float salary) {
        this.name = name;
        this.departNum = departNum;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartNum() {
        return departNum;
    }

    public void setDepartNum(int departNum) {
        this.departNum = departNum;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", departNum=" + departNum +
                ", salary=" + salary +
                '}';
    }

}
