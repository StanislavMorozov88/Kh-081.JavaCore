package homework06;

import java.util.Arrays;

public class MainPayment {
    public static void main(String[] args) {
        Employee[]employees = new Employee[4];
        employees[0] = new SalariedEmployee("1","100",800.0, 12);
        employees[1] = new ContractEmployee("10","111",25000.0);
        employees[2] = new SalariedEmployee("2", "200", 770.0, 9);
        employees[3] = new ContractEmployee("20", "222", 27500.0);

        System.out.println(Arrays.toString(employees));
//        for (Employee employee : employees) {
//
//        }



    }
}
