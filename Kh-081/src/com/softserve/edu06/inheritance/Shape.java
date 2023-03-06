package com.softserve.edu06.inheritance;

public abstract class Shape {
    private double side = 5;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //abstract
    public double getArea() {
        return 20;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "side=" + side +
                '}';
    }
}