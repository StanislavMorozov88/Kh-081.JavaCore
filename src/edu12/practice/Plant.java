package edu12.practice;

public class Plant {
    private int size;
    private Color color;
    private Type type;

    public Plant(int size, Color color, Type type) throws ColorException, TypeException {
        this.size = size;

        if (!isValidColor(color)) {
            throw new ColorException("Invalid color: " + color);
        }
        this.color = color;

        if (!isValidType(type)) {
            throw new TypeException("Invalid type: " + type);
        }
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public Color getColor() {
        return color;
    }

    public Type getType() {
        return type;
    }

    private boolean isValidColor(Color color) {
        for (Color validColor : Color.values()) {
            if (validColor == color) {
                return true;
            }
        }
        return false;
    }

    private boolean isValidType(Type type) {
        for (Type validType : Type.values()) {
            if (validType == type) {
                return true;
            }
        }
        return false;
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
