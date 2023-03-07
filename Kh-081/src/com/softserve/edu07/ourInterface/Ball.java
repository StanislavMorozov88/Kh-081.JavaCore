package com.softserve.edu07.ourInterface;

import com.softserve.edu06.inheritance.Shape;

public class Ball extends Shape implements Volumetric {
    private double radius = 8.2;

    public Ball(String name,double radius) {
        super();
        this.radius = radius;
    }

    public Ball(double v, String myBall) {
        super(v, myBall);
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    public double getVolume() {
        return 4.0 / 3 * Volumetric.PI * Math.pow(radius, 3);
    }
}
