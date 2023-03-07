package com.softserve.edu07.ourInterface;

import com.softserve.edu06.inheritance.Shape;

class Cube extends Shape implements Vertexable, Volumetric {
    private double side = 2;

    public Cube(String name,double side) {
      super();
        this.side = side;
    }

    public Cube(double v, String myCube) {
        super(v, myCube);
    }

    @Override
    public double getArea() {
        return 12 * side;
    }

    @Override
    public double getVolume() {
        return Math.pow(side, 3);
    }

    @Override
    public int getNumberOfVertex() {
        return 8;
    }
}
