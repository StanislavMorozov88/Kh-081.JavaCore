package lesson06.practical.lines;

import java.awt.*;

public class ColorLine extends Line {
    private Color color;

    public ColorLine(Point start, Point end, Color color) {
        super(start, end);
        this.color = color;
    }

    @Override
    public void print() {
        System.out.println("Print() method for ColorLine");
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Color" + super.toString() +
                ", color=" + color.toString().replace("java.awt.Color", "") +
                '}';
    }
}
