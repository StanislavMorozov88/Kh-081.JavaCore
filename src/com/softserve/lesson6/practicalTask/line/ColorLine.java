package com.softserve.lesson6.practicalTask.line;

public class ColorLine extends Line{
    private String color;

    public ColorLine(Point point1, Point point2, String color) {
        super(point1, point2);
        this.color = color;
    }

    public void print(){
        System.out.println("ColorLine " + point1 + " " + point2 + " " + color);
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color='" + color + '\'' +
                '}';
    }
}
