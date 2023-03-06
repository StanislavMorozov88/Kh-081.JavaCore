package com.softserve.edu06.inheritance;


public class Rectangle extends Shape {
    protected int width;
    protected int height;

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return width * height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

class Parallelogram extends Rectangle {
    private int angle;

    public int getAngle() {
        return angle;
    }

    public void setAngle(int angle) {
        this.angle = angle;
    }
}

class Demo {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 5;

        Parallelogram parallelogram = new Parallelogram();
        parallelogram.width = 17;
        parallelogram.height = 10;
       // parallelogram.angle(45);

        System.out.println(rectangle.getPerimeter());
        System.out.println(parallelogram.getPerimeter());

    }

}
