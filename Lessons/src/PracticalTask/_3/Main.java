package PracticalTask._3;

public class Main {
    public static void main(String[] args) {
        //did not add the possibility of input from the console and protection against negative and non-numbers,
        // so as not to accumulate code once again
        Employee w1 = new Employee("Ivan", 10, 10  );
        Employee w2 = new Employee("Petro", 10, 10  );
        Employee w3 = new Employee("Diona");

        System.out.println(Employee.getTotalSum());

        //Heres test for Employye class for rewriting total sum when hours or rate changing
        System.out.println("after:");

        w1.setHours(5);
        w1.setRate(10);

        w2.setHours(20);
        w2.setRate(10);

        w3.setHours(5);
        w3.setRate(5);

        System.out.println(Employee.getTotalSum());
    }
}
