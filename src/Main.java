import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(25, 10);
        System.out.println("Before calling method 'swap': width = " + rectangle.width + ", height = " + rectangle.height);
        swap(rectangle);
        System.out.println("After calling method 'swap': width = " + rectangle.width + ", height = " + rectangle.height);
    }

    private static void swap(Rectangle rectangle) {
        int temp = rectangle.width;
        rectangle.width = rectangle.height;
        rectangle.height = temp;
        System.out.println("Inside the method 'swap': width = " + rectangle.width + ", height = " + rectangle.height);
    }
}