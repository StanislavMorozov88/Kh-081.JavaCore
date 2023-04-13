package project;

import java.util.ArrayList;
import java.util.List;

public class MealManager {
    /**
     * Sort meals by name
     *
     * @param meals
     */
    public static void sortMealByName(List<Meal> meals) {
        meals.sort(((meal, t1) -> meal.getDish().getName().compareTo(t1.getDish().getName())));
    }

    /**
     * Select meals by category and return list with meals of a certain category
     *
     * @param meals
     * @param category
     * @return
     */
    public static List<Meal> mealByCategory(List<Meal> meals, String category) {
        List<Meal> temp = new ArrayList<>();
        meals.forEach(meal -> {
            if (meal.getDish().getCategory().equalsIgnoreCase(category)) {
                //add meals certain category to temp list
                temp.add(meal);
            }
        });
        return temp;
    }

    /**
     * Print meals
     *
     * @param meals
     */
    public static void print(List<Meal> meals) {
        meals.forEach(meal -> {
            String[] words = meal.getIngredients().split(" ");
            System.out.println("Name: " + meal.getDish().getName() + "\nIngredients:\n" + String.join("\n", words) + "\n");
        });
    }
}
