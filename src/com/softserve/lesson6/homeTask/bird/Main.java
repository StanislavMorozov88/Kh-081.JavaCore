package com.softserve.lesson6.homeTask.bird;

public class Main {
    public static void main(String[] args) {
        Bird[] birds = new Bird[4];
        birds[0] = new Eagle(true, true);
        birds[1] = new Swallow(true, true);
        birds[2] = new Penguin(true, false);
        birds[3] = new Chicken(true, false);

        for (Bird j : birds){
            j.fly();
        }

    }
}
