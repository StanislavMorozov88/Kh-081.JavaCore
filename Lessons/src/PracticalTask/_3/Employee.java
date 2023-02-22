package PracticalTask._3;

public class Employee {
    //Fields
    private String name;
    private double rate = 0;
    private double hours = 0;
    private static double totalSum;

    //Constructors
    public Employee() {
    }
    public Employee(String name) {
        this.name = name;
    }
    public Employee(String name, double rate, double hours) {
        totalSum -= this.rate * this.hours;
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += rate * hours;
    }

    //Methods
    public double getSalary(){
        return rate * hours;
    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }
    public double getBonuses(){
        return rate * hours * 0.1;
    }


    //Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        totalSum -= this.rate * this.hours;
        this.rate = rate;
        totalSum += rate * hours;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        totalSum -= this.rate * this.hours;
        this.hours = hours;
        totalSum += rate * hours;
    }

    public static double getTotalSum() {
        return totalSum;
    }

}
