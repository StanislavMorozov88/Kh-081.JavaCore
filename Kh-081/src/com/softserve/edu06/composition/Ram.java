package com.softserve.edu06.composition;

public class Ram {

    private int value;

    public Ram(int value) {
        this.value = value;
    }

    public void open(){
        System.out.println("I'm working");
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}