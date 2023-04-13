package project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class PlannerTest {
    @Test
    public void testCreatePlan() {
        Planner plan = new Planner("Monday", new Dish("lunch", "salad"));
        assertEquals("Monday", plan.getDay());
        assertEquals("lunch", plan.getDish().getCategory());
        assertEquals("salad", plan.getDish().getName());
    }

    @Test
    public void testInputChoice() {
        List<Meal> mealList = List.of(
                new Meal(new Dish("lunch", "salad"), "lettuce, tomato, onion, cheese, olives"),
                new Meal(new Dish("dinner", "burger"), "beef patty, lettuce, tomato, cheese, bun")
        );

        ByteArrayInputStream in = new ByteArrayInputStream("salad".getBytes());
        System.setIn(in);

        String result = Menu.inputChoice(mealList);

        assertEquals("salad", result);
    }

    //message after test "contents have differences only in line separators"
    //i cant fix it
    @Test
    public void testCreatePlanList() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));

        List<Planner> planList = testPlan();

        Menu.printCurrentPlan(planList, new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"});

        assertEquals("""
                Monday
                breakfast: sandwich
                lunch: toast
                dinner: sushi

                Tuesday
                breakfast: waffle
                lunch: soup
                dinner: burger

                Wednesday
                breakfast: oatmeal
                lunch: taco
                dinner: pizza

                Thursday
                breakfast: baguette
                lunch: soup
                dinner: steak

                Friday
                breakfast: omelette
                lunch: sandwich
                dinner: chicken

                Saturday
                breakfast: pancakes
                lunch: taco
                dinner: pasta

                Sunday
                breakfast: eggs
                lunch: salad
                dinner: spaghetti

                """, out.toString());
    }

    //test methods
    public static List<Planner> testPlan() {
        return List.of(
                new Planner("Monday", new Dish("breakfast", "sandwich")),
                new Planner("Monday", new Dish("lunch", "toast")),
                new Planner("Monday", new Dish("dinner", "sushi")),

                new Planner("Tuesday", new Dish("breakfast", "waffle")),
                new Planner("Tuesday", new Dish("lunch", "soup")),
                new Planner("Tuesday", new Dish("dinner", "burger")),

                new Planner("Wednesday", new Dish("breakfast", "oatmeal")),
                new Planner("Wednesday", new Dish("lunch", "taco")),
                new Planner("Wednesday", new Dish("dinner", "pizza")),

                new Planner("Thursday", new Dish("breakfast", "baguette")),
                new Planner("Thursday", new Dish("lunch", "soup")),
                new Planner("Thursday", new Dish("dinner", "steak")),

                new Planner("Friday", new Dish("breakfast", "omelette")),
                new Planner("Friday", new Dish("lunch", "sandwich")),
                new Planner("Friday", new Dish("dinner", "chicken")),

                new Planner("Saturday", new Dish("breakfast", "pancakes")),
                new Planner("Saturday", new Dish("lunch", "taco")),
                new Planner("Saturday", new Dish("dinner", "pasta")),

                new Planner("Sunday", new Dish("breakfast", "eggs")),
                new Planner("Sunday", new Dish("lunch", "salad")),
                new Planner("Sunday", new Dish("dinner", "spaghetti"))
        );
    }
}
