package lesson12.practical.task1;

import java.util.Arrays;
import java.util.Scanner;

public class PlantTest {
    private static final Scanner SC = new Scanner(System.in);

    private static Plant getPlantFromConsole() {
        while (true) {
            int size = readInt();
            System.out.println("Enter one color from the list " + Arrays.toString(Color.values()) + ": ");
            String color = SC.next();
            System.out.println("Enter one type from the list " + Arrays.toString(Type.values()) + ": ");
            String type = SC.next();
            try {
                return new Plant(size, color, type);
            } catch (ColorException | TypeException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
                System.out.println("Enter data again.");
            }
        }
    }

    public static int readInt() {
        int number = -1;
        do {
            System.out.println("Enter positive integer for size: ");
            String str = SC.next();
            try {
                number = Integer.parseInt(str);
            } catch (NumberFormatException e) {
                System.err.println("not int");
            }
        } while (number < 0);
        return number;
    }

    private static void fillPlantsArr(Plant[] plants) {
        for (int i = 0; i< plants.length; i++){
            System.out.println("Generate " + (i+1) + " Plant");
            plants[i] = getPlantFromConsole();
        }
    }


    public static void main(String[] args) {
        Plant[]plants = new Plant[5];
        fillPlantsArr(plants);
        System.out.println(Arrays.toString(plants));
    }
}
