package lesson5.pt2;

//      ColorLine with attributes Color  which extends Line class.
//  Override method toString() and define method print() in every classes`

import java.awt.Color;

public class ColorLine extends Line {
    Color color;

    public ColorLine(Point start, Point end, Color color) {
        // invoke superclass'(Line) constructor
        super(start, end);
        this.color = color;
    }

    @Override
    public String toString() {
        return "ColorLine{" +
                "color=" + color +
                '}';
    }

    //define method print() in every classes`
    void print() {
        //can call by name of fields because they access is 'protected' (about field: start and end)
        System.out.println("Start: "+ start + " End: " + end + " Color: " + color);
    }
}
