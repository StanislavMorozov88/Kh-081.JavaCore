package Lesson6.PracticalTasks;

public class Line {
    Point p1 = new Point();
    Point p2 = new Point();

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line() {

    }

    public void print(){
        System.out.println("I am line with points " +p1 +p2);

    }

}
