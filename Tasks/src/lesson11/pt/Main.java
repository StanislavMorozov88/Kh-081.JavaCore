package lesson11.pt;

import java.util.Scanner;

/**
 * Create a method for calculating the area of a rectangle
 * int squareRectangle (int a, int b),
 * which should throw an exception if the user enters negative value.
 * Input values a and b from console.
 * Check the squareRectangle method in the method main. Check to input nonnumeric value.
 * Create a class Plant, which includes fields int size, Color color and Type type,
 * and constructor where these fields are initialized.
 * Color and type are Enum. Override the method toString( ).
 * Create classes ColorException and TypeException
 * and describe there all possible colors and types of plants.
 * In the method main create an array of five plants.
 * Check to work your exceptions.
 */
public class Main {
    public enum Color {White, Red, Blue}

    public enum Type {Trees, Flowers, Moss, Grasses, Algae}

    public static class Plant {
        private Type type;
        private Color color;
        private int size;

        public class ColorException extends Exception {
            public ColorException(String arg0) {
                super(arg0);
            }
        }

        public class TypeException extends Exception {
            public TypeException(String arg0) {
                super(arg0);
            }
        }

        public Plant(String type, String color, int size) throws ColorException, TypeException {
            Color c = colorStrToEnum(color);
            Type t = typeStrToEnum(type);
            this.size = size;
            this.type = t;
            this.color = c;
        }

        public Color colorStrToEnum(String color) throws ColorException {
            switch (color.toLowerCase()) {
                case "blue":
                    return Color.Blue;
                case "red":
                    return Color.Red;
                case "white":
                    return Color.White;
                default:
                    throw new ColorException("Input only color blue, red or white");
            }
        }

        public Type typeStrToEnum(String type) throws TypeException {
            switch (type.toLowerCase()) {
                case "trees": {
                    return Type.Trees;
                }
                case "flowers": {
                    return Type.Flowers;
                }
                case "moss": {
                    return Type.Moss;
                }
                case "grasses": {
                    return Type.Grasses;
                }
                case "algae": {
                    return Type.Algae;
                }
                default: {
                    throw new TypeException("Input type trees/flowers/moss/grasses/algae");
                }
            }
        }

        @Override
        public String toString() {
            return String.format("Color: %s, Type: %s, Size: %d", color, type, size);
        }
    }

    public static void main(String[] args) {
        try {
            Plant pl = new Plant("trees", "red", 5);
            System.out.println(pl);
        } catch (Plant.ColorException | Plant.TypeException e) {
            System.err.println(e.getMessage() + "\n");
        }
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter values:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println("Area: " + squareRectangle(a, b));
            sc.close();
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage() + "\n");
        }
    }

    public static int squareRectangle(int a, int b) throws ArithmeticException {
        if (a < 0 || b < 0) {
            throw new ArithmeticException("Values must be positive");
        } else {
            return a * b;
        }
    }

}
