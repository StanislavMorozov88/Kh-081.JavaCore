package project;

import org.junit.Test;
import org.junit.Assert;
import java.util.List;

public class MealTest {

    @Test
    public void testAddMeal() {
        Meal meal = new Meal(new Dish("lunch", "soup"), "carrots, ginger, coconut milk, curry");
        Assert.assertEquals("lunch", meal.getDish().getCategory());
        Assert.assertEquals("soup", meal.getDish().getName());
        Assert.assertEquals("carrots, ginger, coconut milk, curry", meal.getIngredients());
    }

    @Test
    public void testGetMealByCategorySorted() {
        List<Meal> meals = testMeals();
        
        List<String> expectedNames  = List.of(
                "pancakes",
                "omelette",
                "eggs",
                "oatmeal",
                "baguette",
                "waffle"
        );

        List<Meal> filteredMeals = MealManager.mealByCategory(meals, "breakfast");
        filteredMeals.sort((m1,m2)->m1.getDish().getCategory().compareTo(m2.getDish().getCategory()));
        Assert.assertEquals(6, filteredMeals.size());

        for (int i = 0; i < filteredMeals.size(); i++) {
            Assert.assertEquals(expectedNames.get(i), filteredMeals.get(i).getDish().getName());
        }
    }
    public static List<Meal> testMeals() {
        return List.of(
                new Meal(new Dish("breakfast", "pancakes"), "flour, sugar, eggs, milk, baking powder, butter"),
                new Meal(new Dish("breakfast", "omelette"), "eggs, cheese, ham, onion, green pepper"),
                new Meal(new Dish("breakfast", "eggs"), "poached eggs, hollandaise sauce"),
                new Meal(new Dish("breakfast", "oatmeal"), "oats,milk,banana,peanut butter"),
                new Meal(new Dish("breakfast", "baguette"), "baguette, butter, jam, coffee"),
                new Meal(new Dish("breakfast", "waffle"), "waffle, syrup, butter"),

                new Meal(new Dish("lunch", "soup"), "carrots, ginger, coconut milk, curry"),
                new Meal(new Dish("lunch", "salad"), "lettuce, tomato, onion, cheese, olives"),
                new Meal(new Dish("lunch", "sandwich"), "toasted bread, turkey, bacon, lettuce, tomato, mayonnaise"),
                new Meal(new Dish("lunch", "toast"), "whole grain bread, avocado, salt, pepper, lemon juice"),
                new Meal(new Dish("lunch", "taco"), "tortilla, ground beef, cheese, lettuce, tomato, salsa"),

                new Meal(new Dish("dinner", "sushi"), "rice, fish, seaweed, soy sauce, wasabi"),
                new Meal(new Dish("dinner", "pizza"), "dough, tomatoes, mozzarella cheese"),
                new Meal(new Dish("dinner", "chicken"), "chicken, potatoes, carrots"),
                new Meal(new Dish("dinner", "spaghetti"), "spaghetti, ground beef, onion, garlic, tomato sauce, red wine"),
                new Meal(new Dish("dinner", "pasta"), "spaghetti, tomato sauce, ground beef, onion, garlic"),
                new Meal(new Dish("dinner", "steak"), "ribeye, garlic, rosemary, butter"),
                new Meal(new Dish("dinner", "burger"), "beef patty, lettuce, tomato, cheese, bun")
        );
    }

}
