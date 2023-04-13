package project;

import java.util.ArrayList;
import java.util.List;

public class Planner {
    private String day;
    private Dish dish;

    public Planner(String day, Dish dish) {
        this.day = day;
        this.dish = dish;
    }

    public String getDay() {
        return day;
    }

    public Dish getDish() {
        return dish;
    }

    @Override
    public String toString() {
        return "Plan{" +
                "day='" + day + '\'' +
                ", category='" + getDish().getCategory() + '\'' +
                ", name='" + getDish().getCategory() + '\'' +
                '}';
    }

    public static List<Planner> planByDay(List<Planner> plans, String day) {
        List<Planner> temp = new ArrayList<>();
        plans.forEach(plan -> {
            if (plan.getDay().equalsIgnoreCase(day)) {
                temp.add(plan);
            }
        });
        return temp;
    }

    public static void printPlan(List<Planner> plans){
        plans.forEach(plan -> {
            System.out.println(plan.getDish().getCategory()+": " + plan.getDish().getName());
        });
    }
}
