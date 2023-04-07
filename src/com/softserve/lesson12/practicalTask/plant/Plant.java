package com.softserve.lesson12.practicalTask.plant;



public class Plant {
    private Type type;
    private Color color;
    private int size;

    public Plant(String type, String color, int size) throws ColorException, TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }

    private Color colorStrToEnum(String color) throws ColorException {
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
    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "rose" : return Type.ROSE;
            case "tulip" : return Type.TULIP;
            case "violet" : return Type.VIOLET;
            default: throw new TypeException("Input only type rose,tulip or violet");
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

    public static void main(String[] args) throws ColorException, TypeException {
        Plant[] plants = new Plant[5];
        plants[0] = new Plant("rose", "red", 4);
        plants[1] = new Plant("tulip", "white", 5);
        plants[2] = new Plant("violet", "blue", 2);
        plants[3] = new Plant("tt", "blue", 2);
        plants[4] = new Plant("violet", "rr", 5);
    }
}

