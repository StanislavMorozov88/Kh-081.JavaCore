package pract02;

public class MainEmployee {
    public static void main(String[] args) {

        Employee e1 = new Employee("Oleg", 1000, 30);
        Employee e2 = new Employee("Liudmyla", 800, 36);
        Employee e3 = new Employee();
        e3.setName("Vitalii");
        e3.setRate(750);
        e3.setHours(28);


        System.out.println(e1);
        //System.out.println(e1.Salary());
        System.out.println(e2);
        System.out.println(e2.Salary());
        System.out.println(e2.Bonuses());
        System.out.println(e3);
        //System.out.println(e3.Salary());
        System.out.println("Total Salary is " + (e1.Salary()+e2.Salary()+ e3.Salary()));

    }
}
