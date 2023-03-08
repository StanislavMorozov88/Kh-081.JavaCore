package com.softserve.lesson6.homeTask.emploee;

public class Developer extends Employee{
    private String position;

    protected Developer(String name, int departmentNumber, double salary, String position) {
        super(name, departmentNumber, salary);
        this.position = position;
    }

    @Override
    public String report() {
        return super.report() + " Position: " + position ;
    }
}
