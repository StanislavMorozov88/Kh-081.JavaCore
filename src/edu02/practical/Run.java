package edu02.practical;

public class Run {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vasyl", 10.50f, 100.5f);
        Employee e2 = new Employee("Olena", 11.50f, 110.5f);
        Employee e3 = new Employee("Roman", 12.50f, 120.5f);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("Vasyl's salary = " + e1.getSalary());
        System.out.println("Olena's salary = " + e2.getSalary());
        System.out.println("Romans's salary = "+ e3.getSalary());

        System.out.println();
        System.out.println("Vasyl's bonus = " + e1.getBonuses());
        System.out.println("Olena's bonus = " + e2.getBonuses());
        System.out.println("Romans's bonus = " + e3.getBonuses());

        System.out.println();
        System.out.println("The total salary of all workers to screen = " + Employee.TotalSum());
    }
}
