package budget_manager_hyperskill;

import java.io.*;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BudgetMenu implements Runnable {
    private final MyBudget myBudget;
    private final Scanner scanner;
    private final String fileName;

    {
        myBudget = new MyBudget();
        scanner = new Scanner(System.in);
        fileName = "./purchases.txt";
    }


    public void run() {
        while (true) {
            Menu.printMenuActions();
            switch (readInt(0, 7)) {
                case 1 -> incomeMenu();
                case 2 -> purchaseMenu();
                case 3 -> listMenu();
                case 4 -> balanceMenu();
                case 5 -> saveMenu();
                case 6 -> loadMenu();
                case 7 -> analyzeMenu();
                case 0 -> {
                    System.out.println("\nBye!");
                    return;
                }
            }
        }
    }

    public void incomeMenu() {
        System.out.println("\nEnter income:");
        double income = readDouble();
        myBudget.increaseBalance(income);
        System.out.println("Income was added!\n");
    }

    public void purchaseMenu() {
        while (true) {
            Menu.PURCHASE.showAction();
            int type = readInt(1, 5);
            if (type == 5) {
                System.out.println();
                break;
            }
            Category category = Category.getCategoryByIndex(type);
            Purchase purchase = Purchase.PurchaseReader.getPurchaseFromConsole();
            myBudget.addPurchase(purchase, category);
            System.out.println("Purchase was added!");
        }
    }

    private void listMenu() {
        List<Purchase> purchaseList = myBudget.getFullPurchaseList();
        if (purchaseList.isEmpty()) {
            printPurchaseList(purchaseList, "All");
            return;
        }
        while (true) {
            Menu.LISTOFPURCHASE.showAction();
            int type = readInt(1, 6);
            if (type == 6) {
                System.out.println();
                return;
            }
            if (type == 5) {
                printPurchaseList(purchaseList, "All");
            } else {
                Category category = Category.getCategoryByIndex(type);
                List<Purchase> purchases = myBudget.getPurchaseListByCategory(category);
                printPurchaseList(purchases, category.getName());
            }
        }
    }

    public void balanceMenu() {
        System.out.println();
        System.out.printf("Balance: $%.2f%n", myBudget.getBalance());
        System.out.println();
    }

    public void saveMenu() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(String.valueOf(myBudget.getBalance()));
            writer.write("\n");
            myBudget.getPurchasesMap().forEach((key, value) -> value.forEach(p -> {
                try {
                    writer.write(key.name() + "#");
                    writer.write(p.getName() + "#");
                    writer.write(p.getPrice() + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }));
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nPurchases were saved!\n");
    }

    public void loadMenu() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            myBudget.clearPurchaseList();
            myBudget.setBalance(Double.parseDouble(br.readLine()));
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                String[] lines = line.split("#");
                Category c = Category.valueOf(lines[0]);
                String name = lines[1];
                double price = Double.parseDouble(lines[2]);
                myBudget.addPurchase(new Purchase(name, price), c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("\nPurchases were loaded!\n");
    }

    public void analyzeMenu() {
        int choice;
        while (true) {
            Menu.ANALYZE.showAction();
            choice = readInt(1, 4);
            switch (choice) {
                case 1 -> showFullSortedResult();
                case 2 -> showSortByType();
                case 3 -> showSortByCertainType();
                case 4 -> {
                    System.out.println();
                    return;
                }
            }
        }
    }

    public void showFullSortedResult() {
        List<Purchase> purchaseList = myBudget.getFullPurchaseList();
        purchaseList.sort(Purchase::compareByPriceDesc);
        printPurchaseList(purchaseList, "All");
    }

    public void showSortByCertainType() {
        System.out.println("\nChoose the type of purchase");
        Category.showCategory();
        int index = readInt(1, 4);
        Category category = Category.getCategoryByIndex(index);
        List<Purchase> purchaseList = myBudget.getPurchaseListByCategory(category);
        purchaseList.sort(Purchase::compareByPriceDesc);
        printPurchaseList(purchaseList, category.getName());
    }

    public void showSortByType() {
        System.out.println("\nTypes:");
        myBudget.getPurchasesMap().entrySet()
                .stream()
                .sorted(Map.Entry.<Category, List<Purchase>>comparingByValue(Comparator.comparingDouble
                        (p -> p.stream().mapToDouble(Purchase::getPrice).sum())).reversed())
                .map(k -> k.getKey().getName() + " - $" + myBudget.totalAmountByCategory(k.getKey()))
                .forEach(System.out::println);
        System.out.printf("Total sum: $%,.2f%n", myBudget.totalAmount());
    }

    public int readInt(int lowerBound, int upperBound) {
        int a;
        while (!scanner.hasNextInt() || ((a = scanner.nextInt()) < lowerBound || a > upperBound)) {
            System.out.printf("Enter value from %d to %d%n", lowerBound, upperBound);
            scanner.nextLine();
        }
        return a;
    }

    public double readDouble() {
        double a;
        while (!scanner.hasNextDouble() || ((a = scanner.nextDouble()) < 0)) {
            System.out.println("Enter positive value");
            scanner.nextLine();
        }
        return a;
    }

    public void printPurchaseList(List<Purchase> purchaseList, String header) {
        if (purchaseList.isEmpty()) {
            System.out.println("\nThe purchase list is empty!\n");
        } else {
            double totalAmount = header.equals("All") ? myBudget.totalAmount() :
                    myBudget.totalAmountByCategory(Category.valueOf(header.toUpperCase()));
            System.out.printf("%n%s:%n", header);
            purchaseList.forEach(System.out::println);
            System.out.printf("Total sum: $%.2f%n", totalAmount);
        }
    }
}
