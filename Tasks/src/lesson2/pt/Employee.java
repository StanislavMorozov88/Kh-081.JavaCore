package lesson2.pt;
//    Create class Employee which should consist of
//          three private fields: name, rate and hours;
//          static field totalSum
//          properties for access to these fields;
//          default constructor and two constructors with parameters;
//          methods:
//              getSalary() - to calculate the salary of person (rate * hours)
//              toString() - to output information about employee
//              getBonuses() – to calculate 10% from salary
//     In the method main() create 3 objects of Employee type.
//     Input information about them.
//     Display the total salary of all workers to screen

public class Employee {
    //fields
    private String name;
    private float rate;
    private int hours;
    private static float totalSum = 0;

    //constructors
    public Employee() {
        totalSum += getSalary();
    }

    public Employee(String name, float rate) {
        this.name = name;
        this.rate = rate;

        totalSum += getSalary();
    }

    public Employee(String name, float rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;

        totalSum += getSalary();
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getRate() {
        return rate;
    }

    public void setRate(float rate) {
        this.rate = rate;
        totalSum += getSalary();
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
        totalSum += getSalary();
    }

    //methods
    public float getSalary() {
        return rate * hours;
    }

    public float getBonuses() {
        return getSalary() / 10;
    }

    @Override
    public String toString() {
        return "Employee {" +
                " name ='" + name + '\'' +
                ", rate = " + rate +
                ", hours = " + hours +
                ", salary = " + getSalary() +
                ", bonuses = " + getBonuses() +
                '}';
    }
    public static float totalSum() {
        return totalSum;
    }
}
