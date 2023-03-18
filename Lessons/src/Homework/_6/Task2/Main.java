package Homework._6.Task2;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Ivan", 18, 12024.5),
                new Developer("Bogdan", 29, 67990.25, "Average Java developer")
        };

        for(Employee employee: employees){
            System.out.println(employee.getClass().getSimpleName() + " -> " + employee.report());
        }
    }
}

/*
        Create a Developer class that extends the Employee class.
        Creates a String field and a constructor to initialize all fields in the Developer class.
        Also in the Developer class, override the method report()
        so that it returns a string with information about the developer, for example:
            Name: Taras, Age: 32 years, Position: Average Java developer, Salary: 32735.35
        If necessary, modify the employee's class so that it meets the principles of encapsulation and inheritance.
        Create an instance of the Employee and Developer class
        and print in the console information about them using report() method.
*/