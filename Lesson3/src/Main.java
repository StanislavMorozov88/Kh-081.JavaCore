public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Oleg");
        Employee e2 = new Employee("Pavlo", 12, 20);
        Employee e3 = new Employee("Sasha", 20, 40);

        e1.setRate(15);
        e1.setHours(40);

        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);
        System.out.println(e3.getSalary());
        System.out.println(e2.getSalary());
        System.out.println(e1.getBonuses());
        System.out.println(e1.getSalary());
    }
}