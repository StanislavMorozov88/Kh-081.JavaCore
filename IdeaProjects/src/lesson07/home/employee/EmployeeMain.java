package lesson07.home.employee;

import java.util.Arrays;

public class EmployeeMain {
    public static void main(String[] args) {

        SalariedEmployee salariedEmployee1 = new SalariedEmployee("Bob","111119",499);
        ContractEmployee contractEmployee1 = new ContractEmployee("Alice","114567",30000);
        Employee salariedEmployee2 = new SalariedEmployee("John","125478",500);
        Employee contractEmployee2 = new ContractEmployee("Tetiana","125897",29000);

        Employee[]employees = {salariedEmployee1,contractEmployee2,salariedEmployee2,contractEmployee1};

        System.out.println(Arrays.toString(employees));
        Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));
        System.out.println(salariedEmployee2.salary);

    }
}
