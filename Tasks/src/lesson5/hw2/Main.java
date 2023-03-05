package lesson5.hw2;

import lesson4.pt.Employee;

//Create an instance of the Employee and Developer class
// and print in the console information about them using report() method. (toString)
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("John", 43, 201);
        Developer developer = new Developer("Mick", 21, 120, "HR");
        //print in the console information about them using report() method
        System.out.println(employee.report());
        System.out.println(developer.report());


    }
}
