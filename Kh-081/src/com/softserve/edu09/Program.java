package com.softserve.edu09;

public class Program {

    public static void main(String[] args) {
        TwoGenerate<Integer, String> twoGen = new TwoGenerate<>(1, "Generics");

        twoGen.printTypes();
        System.out.println("Value T: " + twoGen.getObT());
        System.out.println("Value V: " + twoGen.getObV());
    }
}
