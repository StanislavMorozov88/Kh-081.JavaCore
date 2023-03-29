package lesson12.practical.task1;

import java.util.Arrays;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, String color, String type) throws ColorException, TypeException {
        checkSize(size);
        this.size = size;
        this.color = colorStringToEnum(color);
        this.type = typeStringToEnum(type);
    }

    public Color colorStringToEnum(String color) throws ColorException {
        if (color == null || color.isBlank()) {
            throw new ColorException("Color is null or empty");
        }
        try {
            return Color.valueOf(color.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new ColorException("Incorrect color. Input one of color from list: " + Arrays.toString(Color.values()));
        }
    }

    public Type typeStringToEnum(String type) throws TypeException {
        if (type == null || type.isBlank()) {
            throw new TypeException("Type is null or blank");
        }
        try {
            return Type.valueOf(type.toUpperCase());
        } catch (IllegalArgumentException e) {
            throw new TypeException("Incorrect type. Input one of type from list: " + Arrays.toString(Type.values()));
        }
    }

    public void checkSize(int size) {
        if (size < 0) {
            throw new IllegalArgumentException("Size is negative");
        }
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }
}

enum Color {
    WHITE, RED, BLUE;

    @Override
    public String toString() {
        return super.toString();
    }
}

enum Type {
    ROSE, LILY, TULIP;

    @Override
    public String toString() {
        return super.toString();
    }
}

class ColorException extends Exception {

    public ColorException(String message) {
        super(message);
    }
}

class TypeException extends Exception {

    public TypeException(String message) {
        super(message);
    }
}
