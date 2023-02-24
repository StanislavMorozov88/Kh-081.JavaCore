package pract02;

public class Employee {
    private String name;
    private float rate;
    private int hours;
    private float Salary;
    private static float Bonuses;
    private static float totalSum;
    public Employee(){

    }
    public Employee(String name, float rate) {
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, float rate, int hours) {
        this.name = name;
        this.rate = rate;
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

    public String getName() {
        return this.name;
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public float Salary(){
        return Salary = rate * hours;
    }
    public float Bonuses(){
        return Bonuses = Salary / 10;
    }

}
