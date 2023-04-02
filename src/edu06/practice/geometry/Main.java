package edu06.practice.geometry;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 4);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(5, 6);
        Point p5 = new Point(2, 2);
        Point p6 = new Point(7, 8);

        Line[] lines = {new Line(p1, p2), new ColorLine(p3, p4, "red"), new Line(p5, p6)};

        for (Line line : lines) {
            line.print();
        }
    }
}
