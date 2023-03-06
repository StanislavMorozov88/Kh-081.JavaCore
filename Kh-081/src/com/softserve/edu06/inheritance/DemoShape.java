package com.softserve.edu06.inheritance;

public class DemoShape {
    public static void main(String[] args) {
//        Circle circle = new Circle();
//        System.out.println(circle.getArea());
//
//        Square square = new Square();
//        System.out.println(square.getArea());

        Shape[] shapes = new Shape[4];
        shapes[0] = new Circle();
        shapes[1] = new Square();
        shapes[2] = new Circle();
        shapes[3] = new Square();

        for (Shape shape : shapes) {
            System.out.println(shape.getClass().getSimpleName() + " area: " + shape.getArea());
        }
    }
}
