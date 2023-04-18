package coffeemachine;

import java.util.Scanner;

public class CoffeeMachine {
    private int amountOfWater;
    private int amountOfMilk;
    private int amountOfBeans;
    private int money;
    private int disposableCups;
    private Coffee coffee;

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public CoffeeMachine(int amountOfWater, int amountOfMilk, int amountOfBeans, int money, int disposableCups) {
        this.amountOfWater = amountOfWater;
        this.amountOfMilk = amountOfMilk;
        this.amountOfBeans = amountOfBeans;
        this.money = money;
        this.disposableCups = disposableCups;
    }

    private int countMaxCupsOfCoffee() {
        int w = this.amountOfWater / this.coffee.getWater();
        int m = this.amountOfMilk / this.coffee.getMilk();
        int b = this.amountOfBeans / this.coffee.getBeans();

        int result = Integer.min(w, Integer.min(m, b));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int water = 400;
        int milk = 540;
        int beans = 120;
        int money = 550;
        int disposableCups = 9;

        CoffeeMachine coffeeMachine = new CoffeeMachine(water, milk, beans, money, disposableCups);

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit)");
            String action = scanner.nextLine();
            if ("buy".equals(action)) {
                coffeeMachine.buy();
            } else if ("fill".equals(action)) {
                coffeeMachine.fill();
            } else if ("take".equals(action)) {
                coffeeMachine.take();
            } else if ("remaining".equals(action)) {
                coffeeMachine.remaining();
            } else if ("exit".equals(action)) {
                break;
            }
        }
    }

        private void remaining () {
            System.out.println("The coffee machine has:");
            System.out.println(amountOfWater + " ml of water");
            System.out.println(amountOfMilk + " ml of milk");
            System.out.println(amountOfBeans + " g of coffee beans");
            System.out.println(disposableCups + " disposable cups");
            System.out.println("$" + money + " of money");
        }
        private void fill () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water do you want to add:");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        int beans = scanner.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int cups = scanner.nextInt();

        this.amountOfWater += water;
        this.amountOfMilk += milk;
        this.amountOfBeans += beans;
        this.disposableCups += cups;
        }
        private void take () {
        System.out.println("I gave you " + this.money + "$");
        this.money = 0;
        }
        private void buy () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String n = scanner.next();
        switch (n) {
            case "1":
                amountOfWater -= 250;
                amountOfBeans -= 16;
                disposableCups -= 1;
                money += 4;
                if (amountOfWater >= 0 && amountOfMilk >= 0 && amountOfBeans >= 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (amountOfWater < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (amountOfMilk < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (amountOfBeans < 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            case "2":
                amountOfWater -= 350;
                amountOfMilk -= 75;
                amountOfBeans -= 20;
                disposableCups -= 1;
                money += 7;
                if (amountOfWater >= 0 && amountOfMilk >= 0 && amountOfBeans >= 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (amountOfWater < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (amountOfMilk < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (amountOfBeans < 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            case "3":
                amountOfWater -= 200;
                amountOfMilk -= 100;
                amountOfBeans -= 12;
                disposableCups -= 1;
                money += 6;
                if (amountOfWater >= 0 && amountOfMilk >= 0 && amountOfBeans >= 0) {
                    System.out.println("I have enough resources, making you a coffee!");
                } else if (amountOfWater < 0) {
                    System.out.println("Sorry, not enough water!");
                } else if (amountOfMilk < 0) {
                    System.out.println("Sorry, not enough milk!");
                } else if (amountOfBeans < 0) {
                    System.out.println("Sorry, not enough coffee beans!");
                }
                break;
            case "back":
                return;
            }
        }

    }

