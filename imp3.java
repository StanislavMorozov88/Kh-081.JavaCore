public class imp3 {
    public static void main(String[] args){
    Employee emp1 = new Employee(  "Nikita",  321.7,  7);
    Employee emp2 = new Employee(  "Dima",  340.5,  8);
    Employee emp3 = new Employee(  "Valya",  400.1,  6);

        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);

        System.out.println(emp1.getSalary());
        System.out.println(emp2.getSalary());
        System.out.println(emp3.getSalary());

        System.out.println("Calc full salary with bonuses: ");
        System.out.println(emp1.fullSalary());
        System.out.println(emp2.fullSalary());
        System.out.println(emp3.fullSalary());

        System.out.println("Total salary of all workers: ");
        System.out.println((emp1.fullSalary())+(emp2.fullSalary())+(emp3.fullSalary()));
       // System.out.println(emp1.totalSum());
    }


}

