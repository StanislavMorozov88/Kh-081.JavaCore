package Homework._7.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SalariedEmployee extends Employee implements Payment, Comparable{

    private String socialSecurityNumber;
    private double hourlyRate;
    private int hoursWorked;
    private static List<String> list = new ArrayList<>();

    public SalariedEmployee(String employeeld, double hourlyRate, int hoursWorked) {
        super(employeeld);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

        Random random = new Random();
        String ID;
        do {
            ID = String.valueOf(random.nextInt(0, 9))
                    .concat(String.valueOf(random.nextInt(0, 9)))
                    .concat(String.valueOf(random.nextInt(0, 9)))
                    .concat(String.valueOf(random.nextInt(0, 9)));
        } while (list.contains(ID));
        list.add(ID);

        this.socialSecurityNumber = ID;
    }

    @Override
    public double calculatePay() {
        return hourlyRate * hoursWorked;
    }


    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }


}
