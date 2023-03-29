package Homework._7.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ContractEmployee extends Employee implements Payment, Comparable{

    private String federalTaxIdMember;
    private double fixedMonthlyPayment;
    private static List<String> list = new ArrayList<>();


    public ContractEmployee(String employeeld, double fixedMonthlyPayment) {
        super(employeeld);
        this.fixedMonthlyPayment = fixedMonthlyPayment;
        /*
        Оскільки я заборонив створювати ID, то генерувати айді сам
        Можна було просто додавати по одному за кожного мембера, але так не цікаво,
        тому ось якась імітація створення айді, звісно не алгоритм генерації номеру Visa, але
        */
        Random random = new Random();
        String ID;
        do {
            ID = String.valueOf(random.nextInt(0, 9))
                    .concat(String.valueOf(random.nextInt(0, 9)))
                    .concat(String.valueOf(random.nextInt(0, 9)));
        }while (list.contains(ID));
        list.add(ID);
        this.federalTaxIdMember = ID;
    }

    @Override
    public double calculatePay() {
        return fixedMonthlyPayment;
    }

    public String getFederalTaxIdMember() {
        return federalTaxIdMember;
    }

}
