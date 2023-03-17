package PracticalTask._6.CompositionTask;

public class Main {
    public static void main(String[] args) {

        Line[] lines = {
                new ColorLine(new Point(-1, -1), new Point(1, 1), Colors.CYAN),
                new Line(new Point(0, -1.3), new Point(5, -3.1)),
                new ColorLine(new Point(6, -0.3), new Point(3, 1), Colors.PURPLE),
                new Line(new Point(-1.5, 0), new Point(0, 4)),
                new ColorLine(new Point(0, -5), new Point(5, 0), Colors.GREEN)
        };

        int count=1;
        for (Line line: lines){                                                    //     ↓ наш print() ↓
            System.out.println("№" + count + " " + line.getClass().getSimpleName() + " " + line.print());
            count++;
        }
    }
}
/*
    Create three classes:
       -Point with attributes x and y
       -Line which contains two object of Point class
       -ColorLine with attributes Color  which extends Line class.
    Override method toString() and define method print() in every class's
    In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it.
*/
