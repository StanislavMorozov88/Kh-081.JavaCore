package com.softserve.edu08;

public class FormulaTest {
    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return sqrt(a * 5);
            }
        };
        double result = formula.calculate(20);
        System.out.println("Square root of 100 is " + result);
    }
}
