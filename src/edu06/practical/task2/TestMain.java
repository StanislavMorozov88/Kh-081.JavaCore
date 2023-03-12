package edu06.practical.task2;

public class TestMain {
    public static void main(String[] args) {
        Line[] lines = {
          new Line(new Point(1,1), new Point(2,2)),
          new ColorLine(new Point(3,3), new Point(5,5), "Black"),
          new Line(new Point(10,10), new Point(15,15)),
          new ColorLine(new Point(20,20), new Point(30,30), "Green")
        };

        for (Line line: lines) {
            System.out.println(line);
        }

        System.out.println(" ---- ");
        for(int i = 0; i < lines.length; i++){
            lines[i].print();
        }
    }
}
