package com.softserve.edu06.composition;

public class Computer {

    private final Ram ram;
    private final Ssd ssd;

    public static class Company{
        private Company company;
    }

    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }

    public void printState() {
        System.out.println("Computer: ram " + ram.getValue() + ", ssd " + ssd.getValue());
    }
}