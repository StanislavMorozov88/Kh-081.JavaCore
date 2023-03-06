package com.softserve.edu06;

public class Circle {
    private Point point;
    private int radius;

    public Circle(Point point, int radius) {
        this.point = point;
        this.radius = radius;
    }
}
class Test1{
    public static void main(String[] args) {
      //  Point point = new Point(14,12);
        Circle c1 = new Circle(new Point(14,12),14);
     //   Circle c1 = new Circle1(point,14);
    }
}
