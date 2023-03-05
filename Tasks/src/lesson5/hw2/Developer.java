package lesson5.hw2;

// i`ve taken class from 5 lesson(package lesson4)

import lesson4.pt.Employee;

//Support we have a class Employee
//Create a Developer class that extends the Employee class.
// Creates a String field and a constructor to initialize all fields in the Developer class.

//Also in the Developer class, override the method report()


//extends Employee from last lesson
public class Developer extends Employee {
    //add String field
    private String position;

    // initialize all fields
    public Developer(String name, int departNum, float salary, String position) {
        // invoke superclass'(Employee) constructor
        super(name, departNum, salary);
        this.position = position;
    }

    //Also in the Developer class, override the method report()
    //so that it returns a string with information about the developer, for example:
    //        Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35

    //override report() method
    @Override
    public String report() {
        return String.format("Name: %s, DepartNum: %d, Position: %s, Salary: \u20B4 %,2f.",
                getName(), getDepartNum(), position, getSalary());
    }


    @Override
    public String toString() {
        return "Developer{" +
                "name='" + getName() + '\'' +
                ", departNum=" + getDepartNum() +
                ", salary=" + getSalary() +
                ", position='" + position + '\'' +
                '}';
    }

}
