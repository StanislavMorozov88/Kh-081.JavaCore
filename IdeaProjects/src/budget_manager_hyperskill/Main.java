package budget_manager_hyperskill;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        //new BudgetMenu().run();
        MyBudget myBudget = new MyBudget();
        myBudget.addPurchase(new Purchase("chease",10),Category.FOOD);

        List<Map<Category,List<Purchase>>>mapList = new ArrayList<>();
        mapList.add(Map.of(Category.CLOTHES,List.of(new Purchase("apple",10))));
        mapList.add(Map.of(Category.FOOD,List.of(new Purchase("akl",10))));
        mapList.forEach(k->myBudget.getPurchasesMap().putAll(k));
        System.out.println(myBudget.getPurchasesMap());
    }
}
