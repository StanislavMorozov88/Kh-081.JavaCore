package coffeemachine;
class Coffee {
    private int water;
    private int milk;
    private int beans;
    private int cost;

    public int getCost() {
        return cost;
    }

    public int getWater() {
        return water;
    }

    public int getMilk() {
        return milk;
    }

    public int getBeans() {
        return beans;
    }

    public Coffee(int water, int milk, int beans, int cost) {
        this.water = water;
        this.milk = milk;
        this.beans = beans;
        this.cost = cost;
    }

    public Coffee() {
        this(200, 50, 15, 0);
    }

    public void prepare(int cups) {
        int amountOfWater = this.water * cups;
        int amountOfMilk = this.milk * cups;
        int amountOfBeans = this.beans * cups;
        System.out.println("For preparing 5 cups of coffee you need:");
        System.out.println(amountOfWater + " ml of water");
        System.out.println(amountOfMilk + " ml of milk");
        System.out.println(amountOfBeans + " g of coffee beans");

    }

}
