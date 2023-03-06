package com.softserve.edu06.composition;

public class CompositionRunner {

    public static void main(String[] args) {
        //Ram ram = new Ram(16);
       // Ssd ssd = new Ssd(512);

        Computer computer = new Computer(new Ram(16), new Ssd(512));

        computer.printState();
    }
}