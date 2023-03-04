package lesson06.practical.lines;

import java.awt.*;

public class TestMain {
    public static void main(String[] args) {
        Line[]lines = {
                new Line(new Point(1,1),new Point(2,2)),
                new Line(new Point(-1,-1),new Point(-2,-2)),
                new ColorLine(new Point(4,4),new Point(5,5), Color.red),
                new ColorLine(new Point(-6,-6),new Point(-7,-7),Color.yellow)
        };

        for (Line elem:lines) {
            elem.print();
            elem.getStart().print();
            elem.getEnd().print();
            System.out.println();
        }
    }
}
