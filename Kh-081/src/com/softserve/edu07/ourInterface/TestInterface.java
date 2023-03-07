package com.softserve.edu07.ourInterface;

import com.softserve.edu06.inheritance.Circle;
import com.softserve.edu06.inheritance.Shape;
import com.softserve.edu06.inheritance.Square;

public class TestInterface {
    public static void main(String[] args) {
        Shape shapes[] = {
                new Square(7.2,"MySquare"),
                new Circle(5.8, "MyCircle"),
                new Cube(6.7, "MyCube"),
                new Ball(6.3, "MyBall")};

        //зверніть увагу для кого вивело площу і об'єм
        for(Shape shape:shapes){
            double area = shape.getArea();
            System.out.println("Shape area for " + shape.getClass().getSimpleName() + " " + area);
            if (shape instanceof Volumetric) {
                double volume = ((Volumetric) shape).getVolume();
                System.out.println("Shape volume for " + shape.getClass().getSimpleName() + " " + volume);
            }
        }
    }



}
