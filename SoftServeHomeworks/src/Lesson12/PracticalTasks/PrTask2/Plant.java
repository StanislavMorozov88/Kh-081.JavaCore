package Lesson12.PracticalTasks.PrTask2;

import java.util.Arrays;

public class Plant {
    public static void main(String[] args) throws ColorException, TypeException {
        try {
            Plant[] plants = new Plant[5];
            plants[0] = new Plant(3, "erg", "tulip");
            plants[1] = new Plant(1, "red", "rose");
            plants[2] = new Plant(4, "red", "rose");
            plants[3] = new Plant(3, "blue", "cactus");
            plants[4] = new Plant(3, "red", "gdfs");
            System.out.println(Arrays.toString(plants));
        }
        catch (ColorException | TypeException e){
            System.out.println(e.getMessage());
        }
    }
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException,TypeException {
        Color c = colorStrToEnum(color);
        Type t = typeStrToEnum(type);
        this.size = size;
        this.type = t;
        this.color = c;
    }


    @Override
    public String toString() {
        return "Plant" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type ;
    }
    private Color colorStrToEnum(String color) throws ColorException{
        switch(color.toLowerCase()){
            case "blue" : return Color.BLUE;
            case "red" : return Color.RED;
            case "white" : return Color.WHITE;
            default : throw new ColorException("Input only color blue, red or white");
        }
    }
    private Type typeStrToEnum(String type) throws TypeException{
        switch(type.toLowerCase()){
            case "rose" : return Type.ROSE;
            case "tulip" : return Type.TULIP;
            case "cactus" : return Type.CACTUS;
            default: throw new TypeException("Input only type rose,tulip or cactus");
        }
    }

}

