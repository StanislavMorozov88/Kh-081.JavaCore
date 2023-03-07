package com.softserve.edu06.inheritance;

public class Circle extends Shape {
    private double radius = 3.5;

    public Circle() {
        super();
    }
    public Circle(double v, String myCircle) {
        super(v, myCircle);
    }


    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
