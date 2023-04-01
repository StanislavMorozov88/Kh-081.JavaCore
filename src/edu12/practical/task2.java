package edu12.practical;

import java.lang.reflect.Type;

public class task2 {
    public static void main(String[] args) {
        try {
            Plant[] pl = {
                    new Plant("fruit", "blue", 1),
                    new Plant("vegetable", "white", 2),
                    new Plant("flower", "red", 3),
                    new Plant("fruit", "white", 4),
                    new Plant("vegetable", "blue", 5)
            };

            for(Plant plant : pl){
                System.out.println(plant);
            }

        } catch (ColorException | TypesException e) {
            System.err.println(e.getMessage() + "\n");
            //e.printStackTrace();
        }

    }
}

enum Types {Fruit, Vegetable, Flower}
enum Color {White, Red, Blue}
class ColorException extends Exception{
    public ColorException(String arg0) {
        super(arg0);
    }
}
class TypesException extends Exception{
    public TypesException(String arg0) {
        super(arg0);
    }
}

class Plant{
    private Types type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypesException{
        Color c = colorStrToEnum(color);
        Types t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }


    private Types typeStrToEnum(String type) throws TypesException {
        switch(type.toLowerCase()){
            case "fruit" : return Types.Fruit;
            case "vegetable" : return Types.Vegetable;
            case "flower" : return Types.Flower;
            default : throw new TypesException("Input only type fruit, vegetable or flower");
        }
    }

    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.Blue;
            case "red" : return Color.Red;
            case "white" : return Color.White;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "type=" + type +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}

