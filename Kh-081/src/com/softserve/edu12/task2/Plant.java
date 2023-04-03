package com.softserve.edu12.task2;

import java.util.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Plant {
    private final int size;
    private final Color color;
    private final Type type;

    enum Color {
        WHITE,
        RED,
        BLUE
    }
    enum Type {
        FLOWER,
        TREE,
        GRASS
    }
    public static class ColorException extends Exception {
        public ColorException(String message) {
            super(message);
        }
    }
    public static class InvalidCombinationException extends Exception {
        public InvalidCombinationException(String message) {
            super(message);
        }
    }
    public static class TypeException extends Exception {
        public TypeException(String message) {
            super(message);
        }
    }

    private static final String[] VALID_COLORS = {"blue", "red", "white"};
    private static final String[] VALID_TYPES = {"flower", "tree", "grass"};
    private static final List<String> VALID_COLORS_AND_TYPES = generateValidCombinations();

    public Plant(int size, String color, String type) throws ColorException, TypeException, InvalidCombinationException {
        this.size = size;
        this.color = colorStrToEnum(color);
        this.type = typeStrToEnum(type);
        if (!isValidCombination(color.toLowerCase(), type.toLowerCase())) {
            throw new InvalidCombinationException("Invalid combination of color and type");
        }
    }

    private static List<String> generateValidCombinations() {
        List<String> validCombinations = new ArrayList<>();
        for (String color : Plant.VALID_COLORS) {
            for (String type : Plant.VALID_TYPES) {
                validCombinations.add(color.toLowerCase() + "," + type.toLowerCase());
            }
        }
        return validCombinations;
    }

    private Color colorStrToEnum(String color) throws ColorException {
        return switch (color.toLowerCase()) {
            case "blue" -> Color.BLUE;
            case "red" -> Color.RED;
            case "white" -> Color.WHITE;
            default -> throw new ColorException("Input only color blue, red or white");
        };
    }

    private Type typeStrToEnum(String type) throws TypeException {
        return switch (type.toLowerCase()) {
            case "flower" -> Type.FLOWER;
            case "tree" -> Type.TREE;
            case "grass" -> Type.GRASS;
            default -> throw new TypeException("Input only flower, tree or grass");
        };
    }

    private boolean isValidCombination(String color, String type) {
        return Arrays.asList(VALID_COLORS_AND_TYPES).contains(color.toLowerCase() + "," + type.toLowerCase());
    }

    @Override
    public String toString() {
        return "Plant{" +
                "size=" + size +
                ", color=" + color +
                ", type=" + type +
                '}';
    }

    public static void main(String[] args) {
        Plant[] plants = new Plant[5];
        try {
            plants[0] = new Plant(10, "red", "flower");
            plants[1] = new Plant(5, "blue", "tree");
            plants[2] = new Plant(8, "white", "grass");
            plants[3] = new Plant(20, "white", "flower");
            plants[4] = new Plant(8, "blue", "tree");

        } catch (ColorException | TypeException e) {
            System.out.println("Error creating plant: " + e.getMessage());
        } catch (InvalidCombinationException e) {
            System.out.println("Error creating plant: Invalid combination of color and type");
        }
        for (Plant plant : plants) {
            if (plant != null){

                System.out.println(plant);
            }
        }

    }
 }

