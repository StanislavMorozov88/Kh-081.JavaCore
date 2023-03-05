package lesson5.pt2;

//  Create three classes:
//      Point with attributes x and y
//      Line which contains two object of Point class
//      ColorLine with attributes Color  which extends Line class.
//  Override method toString() and define method print() in every classes`
//  In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it.

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Line[] lines = new Line[]{
                new Line(new Point(3, 4), new Point(6, 4)),
                new ColorLine(new Point(1, 2), new Point(2, 1), new Color(231, 168, 7)),
                new Line(new Point(2, 1), new Point(4, 7)),
                new ColorLine(new Point(3, 6), new Point(4, 1), Color.RED)
        };

        for (int i = 0; i < lines.length; i++) {
            lines[i].print();
        }

    }
}
