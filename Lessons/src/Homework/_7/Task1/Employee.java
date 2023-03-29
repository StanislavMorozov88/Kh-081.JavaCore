package Homework._7.Task1;

public class Employee implements Comparable {
    protected String employeeld;

    public Employee(String employeeld) {
        this.employeeld = employeeld;
    }

    @Override
    public int compareTo(Object o) {
        int resultBySalary = Double.compare(((Payment) this).calculatePay(), ((Payment) o).calculatePay());
        if(resultBySalary!=0){
            return -resultBySalary;
        }
        return this.getEmployeeld().compareTo(((Employee) o).getEmployeeld());
    }

    public String getEmployeeld() {
        return employeeld;
    }
}
