package edu02.practical;

public class Employee {
    private String name;

    private float rate, hours;

    private static float totalSum;

    public Employee(){
        totalSum += (rate * hours);
    }

    public Employee(String name, float rate){
        this.name = name;
        this.rate = rate;
        totalSum += (rate * hours);

    }

    public Employee(String name, float rate, float hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
        totalSum += (rate * hours);

    }

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
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public float getSalary(){
        return rate * hours;
    }

    public float getBonuses(){
        return (rate * hours) / 10;
    }

    public static float TotalSum(){
        return totalSum;
    }
}
