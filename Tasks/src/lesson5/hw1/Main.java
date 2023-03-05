package lesson5.hw1;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[]{
                new Eagle(true,true),
                new Penguin(true,true),
                new Swallow(true,true),
                new Chicken(true,true)
        };
        for (int i = 0; i < birds.length; i++) {
            birds[i].fly();
        }
    }
}
