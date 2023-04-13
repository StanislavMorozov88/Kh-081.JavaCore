package project;

import java.util.Objects;

public class Dish {
    private String category;
    private String name;

    public Dish(String category, String name) {
        this.category = category;
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Dish dish = (Dish) o;

        return Objects.equals(name, dish.name);
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

}
