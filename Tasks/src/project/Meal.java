package project;

public class Meal {
    private Dish dish;
    private String ingredients;

    public Meal(Dish dish, String ingredients) {
        this.dish = dish;
        this.ingredients = ingredients;
    }

    public Dish getDish() {
        return dish;
    }

    public String getIngredients() {
        return ingredients;
    }

    @Override
    public String toString() {
        String[] words = getIngredients().split(" ");
        return String.format("Category: %s \nName: %s \nIngredients: \n%s", dish.getCategory(), dish.getName(), String.join("\n", words));
    }

}

