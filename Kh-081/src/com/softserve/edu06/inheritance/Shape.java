package com.softserve.edu06.inheritance;

public abstract class Shape {
    private double side = 5;
    private String name;

    public Shape() {
        this.name=name;
    }
    public Shape(double v, String name) {
        this.name=name;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public void setName(String name) {
        this.name = name;
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