package edu12.practice;

public class PlantTest {
    public static void main(String[] args) {
        Plant[] plants = new Plant[5];

        try {
            plants[0] = new Plant(10, Color.RED, Type.FLOWER);
            plants[1] = new Plant(20, Color.BLUE, Type.TREE);
            plants[2] = new Plant(30, Color.GREEN, Type.BUSH);
            plants[3] = new Plant(40, Color.YELLOW, Type.GRASS);
            plants[4] = new Plant(50, Color.PURPLE, Type.FLOWER);
        } catch (ColorException | TypeException e) {
            System.err.println("Error: " + e.getMessage());
        }

        for (Plant plant : plants) {
            System.out.println(plant);
        }
    }
}
