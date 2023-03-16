package edu07.homework.task1;

public class task1 {
    public static void main(String[] args) {
        Employee[] employees = {
                new SalariedEmployee("SE1111", "Alex", 150, 10),
                new ContractEmployee("CE2222", "Max", 2000)
        };

        for(Employee employee : employees){
            System.out.println(employee);
        }
    }
}
