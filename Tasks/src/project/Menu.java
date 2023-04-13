package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    public static void menu(){
        Scanner scanner = new Scanner(System.in);

        //create meals list
        List<Meal> meals = new ArrayList<>();

        //menu
        while (true) {
            System.out.println("What would you like to do (add, show, plan, exit)?");
            switch (scanner.nextLine()) {
                case "add" -> add(meals);
                case "show" -> show(meals);
                case "plan" -> createPlanByDay(meals);
                case "exit" -> {
                    System.out.println("Bye!");
                    scanner.close();
                    return;
                }
                default -> {
                }
            }
        }
    }
    private static void add(List<Meal> meals) {
        //input meal category
        System.out.println("Which meal do you want to add (breakfast, lunch, dinner)?");
        String category = inputCategory();

        //input meal name
        System.out.println("Input the meal's name:");
        String name = inputName();

        //input meal ingredients
        System.out.println("Input the ingredients:");
        String ingredients = inputIngredients();

        //add to list
        meals.add(new Meal(new Dish(category, name), ingredients));
        //message about success
        System.out.println("The meal has been added!");
    }

    private static void show(List<Meal> meals) {
        System.out.println("Which category do you want to print (breakfast, lunch, dinner)?");
        String category = inputCategory();
        //output sorted meal
        showSortedMeals(meals, category);
    }

    private static void createPlanByDay(List<Meal> meals) {
        String[] days = new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String[] categories = new String[]{"breakfast", "lunch", "dinner"};

        //create plan list
        List<Planner> plans = new ArrayList<>();

        // fill plan list (day, category, meal name)
        for (String day : days) {
            System.out.println(day);
            for (String value : categories) {
                //create list for meal name
                List<Meal> mealName = MealManager.mealByCategory(meals, value);
                MealManager.sortMealByName(mealName);
                mealName.forEach(meal -> System.out.println(meal.getDish().getName()));

                System.out.println("Choose the " + value + " for " + day + " from the list above:");

                //user input correct choice
                String choice = inputChoice(mealName);
                plans.add(new Planner(day, new Dish(value, choice)));
            }
            System.out.println("Yeah! We planned the meals for " + day + ".");
        }

        printCurrentPlan(plans, days);
    }

    //methods for 'add'
    private static String inputCategory() {
        Scanner scanner = new Scanner(System.in);
        String category = scanner.nextLine();
        while (!category.equalsIgnoreCase("lunch") && !category.equalsIgnoreCase("breakfast") && !category.equalsIgnoreCase("dinner")) {
            System.out.println("Wrong meal category! Choose from: breakfast, lunch, dinner.");
            category = scanner.nextLine();
        }
        return category;
    }

    private static String inputName() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        while (!name.matches("[a-zA-Z ]+")) {
            System.out.println("Wrong format. Use letters only!");
            name = scanner.nextLine();
        }
        return name;
    }

    private static String inputIngredients() {
        Scanner scanner = new Scanner(System.in);
        String ing = scanner.nextLine();
        while (!ing.matches("^[a-zA-Z ]+(, [a-zA-Z ]+)*$")) {
            System.out.println("Wrong format. Use letters only!");
            ing = scanner.nextLine();
        }
        return ing;
    }

    //method for 'show'
    private static void showSortedMeals(List<Meal> meals, String category) {
        if (meals.isEmpty()) {
            System.out.println("No meals saved. Add a meal first.");
        } else {
            //sort by category and add to temp list
            List<Meal> currentCategory = MealManager.mealByCategory(meals, category);
            //sort by name
            MealManager.sortMealByName(currentCategory);
            //output
            MealManager.print(currentCategory);
        }
    }

    //methods for 'plan'
     protected static String inputChoice(List<Meal> meals) {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        boolean found = false;
        while (!found) {
            for (Meal meal : meals) {
                if (meal.getDish().getName().equalsIgnoreCase(choice)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("This meal doesn't exist. Choose a meal from the list above.");
                choice = scanner.nextLine();
            }
        }
        return choice;
    }

    protected static void printCurrentPlan(List<Planner> plans, String[] days) {
        for (String day : days) {
            System.out.println(day);
            List<Planner> temp = Planner.planByDay(plans, day);
            Planner.printPlan(temp);
            System.out.print("\n");
        }
    }
}
