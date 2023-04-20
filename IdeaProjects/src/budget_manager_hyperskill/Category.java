package budget_manager_hyperskill;

import java.io.Serializable;
import java.util.Arrays;

public enum Category implements Serializable {
    FOOD(1, "Food"),
    CLOTHES(2, "Clothes"),
    ENTERTAINMENT(3, "Entertainment"),
    OTHER(4, "Other");

    private final int index;
    private final String name;

    Category(int index, String name) {
        this.index = index;
        this.name = name;
    }

    public int getIndex() {
        return this.index;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.getIndex() + ") " + this.getName();
    }

    public static void showCategory() {
        Arrays.stream(Category.values()).forEach(pt -> System.out.println(pt.toString()));
    }

    public static Category getCategoryByIndex(int index) {
        return Arrays.stream(Category.values()).filter(pt -> pt.getIndex() == index).findFirst().orElse(null);
    }
}
