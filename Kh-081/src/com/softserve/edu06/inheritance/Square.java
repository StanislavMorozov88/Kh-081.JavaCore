package com.softserve.edu06.inheritance;

public class Square extends Shape {

  // @Override
    public double getArea() {
        return getSide() * getSide();
    }
}
