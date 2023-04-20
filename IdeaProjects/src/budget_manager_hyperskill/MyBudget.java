package budget_manager_hyperskill;

import java.util.*;
import java.util.stream.Collectors;

public class MyBudget {
    private double balance;
    private final Map<Category, List<Purchase>> purchasesMap;

    {
        balance = 0;
        purchasesMap = new TreeMap<>(Map.of(
                Category.FOOD, new ArrayList<>(),
                Category.CLOTHES, new ArrayList<>(),
                Category.ENTERTAINMENT, new ArrayList<>(),
                Category.OTHER, new ArrayList<>()
        ));
    }

    public boolean addPurchase(Purchase purchase, Category category) {
        if (purchase != null && category != null) {
            purchasesMap.get(category).add(purchase);
            decreaseBalance(purchase.getPrice());
            return true;
        }
        return false;
    }

    public void increaseBalance(double income) {
        setBalance(getBalance() + income);
    }

    private void decreaseBalance(double amount) {
        if (amount > balance) {
            setBalance(0);
        }else {
            setBalance(getBalance() - amount);
        }
    }

    public List<Purchase> getFullPurchaseList() {
        return purchasesMap
                .values().stream()
                .flatMap(Collection::stream)
                .collect(Collectors.toList());
    }

    public List<Purchase> getPurchaseListByCategory(Category category) {
        return purchasesMap.get(category);
    }

    public double totalAmount() {
        return purchasesMap.values()
                .stream()
                .flatMap(Collection::stream)
                .mapToDouble(Purchase::getPrice).sum();
    }

    public double totalAmountByCategory(Category c) {
        return purchasesMap.get(c).stream()
                .mapToDouble(Purchase::getPrice).sum();
    }

    public void clearPurchaseList() {
        purchasesMap.forEach((k, v) -> v.clear());
    }

    public Map<Category, List<Purchase>> getPurchasesMap() {
        return purchasesMap;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
