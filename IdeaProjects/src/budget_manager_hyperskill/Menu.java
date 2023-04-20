package budget_manager_hyperskill;

import java.util.Arrays;
import java.util.List;

enum Menu {
    INCOME(1, "Add income"),
    PURCHASE(2, "Add purchase") {
        @Override
        public void showAction() {
            System.out.println("\nChoose the type of purchase");
            Category.showCategory();
            System.out.println("5) Back");
        }
    },
    LISTOFPURCHASE(3, "Show list of purchases") {
        @Override
        public void showAction() {
            System.out.println("\nChoose the type of purchase");
            Arrays.stream(Category.values())
                    .forEach(category -> System.out.println(category.toString()));
            System.out.println("5) All\n6) Back");
        }
    },
    BALANCE(4, "Balance"),
    SAVE(5, "Save"),
    LOAD(6, "Load"),
    ANALYZE(7, "Analyze (Sort)") {
        @Override
        public void showAction() {
            List.of(
                    "\nHow do you want to sort?",
                    "1) Sort all purchases",
                    "2) Sort by type",
                    "3) Sort certain type",
                    "4) Back"
            ).forEach(System.out::println);
        }
    },
    EXIT(0, "Exit");

    private final int menuPunkt;
    private final String description;

    public void showAction() {
    }

    Menu(int n, String description) {
        this.menuPunkt = n;
        this.description = description;
    }

    public int getMenuPunkt() {
        return this.menuPunkt;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.getMenuPunkt() + ") " + this.getDescription();
    }

    public static void printMenuActions() {
        System.out.println("Choose your action:");
        Arrays.stream(Menu.values())
                .forEach(m -> System.out.println(m.toString()));
    }
}