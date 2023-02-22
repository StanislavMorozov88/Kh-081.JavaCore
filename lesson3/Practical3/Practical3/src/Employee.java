public class Employee {
    private String name;
    private double rate;
    private int hours;
    private static double salary = 0;


    public Employee() {
    }

    public Employee(String name, double rate, int hours) {
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }

    public double getSalary() {
        return  salary=rate * hours;
    }

    public double getBonus() {
        return  salary+(getSalary() * 0.1);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", hours=" + hours +
                '}';
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Roman", 21, 8 );
        Employee e2 = new Employee("Iryna",22,8);
        Employee e3 = new Employee("Ivan",20,10);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("The salary fisrt employee is "+e1.getSalary());
        System.out.println("The salary second employee is "+e2.getBonus());
        System.out.println("The salary third employee is "+e3.getSalary());
    }
}