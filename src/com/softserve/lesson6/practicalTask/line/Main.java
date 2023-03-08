package com.softserve.lesson6.practicalTask.line;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[4];
        lines[0] = new Line(new Point(1, 5), new Point(3, 4));
        lines[1] = new ColorLine(new Point(2, 6), new Point(7, 8), "red");
        lines[2] = new Line(new Point(3, 4), new Point(2, 1));
        lines[3] = new ColorLine(new Point(9, 9), new Point(8, 8), "blue");

        for (Line j : lines){
            j.print();
        }
    }
}
