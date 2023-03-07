package com.softserve.edu06.inheritance;

public class Square extends Shape {


    public Square(double v, String mySquare) {
        super(v, mySquare);
    }

    public Square() {

    }

    // @Override
    public double getArea() {
        return getSide() * getSide();
    }
}
